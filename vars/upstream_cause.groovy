def call() {
    def build = currentBuild.rawBuild
    def cause = build.getCause(hudson.model.Cause.UpstreamCause.class)

    if ( cause ) {
        return true
    } else {
        return false
    }
}
