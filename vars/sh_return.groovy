def call(command) {
    def output = sh returnStdout: true, script: command
    return output
}
