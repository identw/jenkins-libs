def call(folder) {
    def rev
    dir(folder) {
        rev = sh returnStdout: true, script: 'echo -n "`svn info --show-item last-changed-revision`"'
    }
    return rev
}
