def call() {
    def tmp = sh returnStdout: true, script: 'echo -n "`svn info --show-item last-changed-revision`"'
    return tmp
}
