def call(ref) {
    return sh (returnStdout: true, script: "git rev-parse --short ${ref}").trim()
}
