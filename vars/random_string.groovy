def call(len = 12) {
    def tmp = sh returnStdout: true, script: "echo -n \"`cat /dev/urandom | tr -dc \'a-zA-Z0-9\' | fold -w ${len} | head -n 1`\""
    return tmp
}
