def call(dir) {
    def rev = sh returnStdout: true, script: 'echo -n "`svn info --show-item last-changed-revision`"'
    return rev
}
