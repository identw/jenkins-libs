def call() {
    def tmp = sh returnStdout: true, script: 'echo -n "`cat /dev/urandom | tr -dc \'a-zA-Z0-9\' | fold -w 32 | head -n 1`"'
    return tmp
}
