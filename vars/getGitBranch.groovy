def call(ref) {
    return sh (returnStdout: true, script: "git branch -a --contains ${ref} | tail -n1 | sed 's@.*origin/\\(.*\\)\$@\\1@g'").trim()
}
