def call(ref) {
    def commit = sh (returnStdout: true, script: "git rev-parse ${ref}").trim()
    def headBranch = sh(returnStdout: true, script: "find .git/refs/remotes -type f | while read f; do if cat \${f} | grep '${commit}' -q; then echo \${f};fi;done | sed 's@^\\./@@;s@.*origin/\\(.*\\)\$@\\1@g'").trim()

    if (headBranch == '') {
        return sh (returnStdout: true, script: "git branch -a --contains ${ref} | tail -n1 | sed 's@.*origin/\\(.*\\)\$@\\1@g'").trim()
    } else {
        return headBranch
    }
}
