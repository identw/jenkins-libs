def call() {
    def build = currentBuild.rawBuild
    def cause = build.getCause(hudson.model.Cause.UserIdCause.class)
    def name
    if ( cause != null ) {
        name = cause.getUserName()
    } else {
        cause = build.getCause(hudson.model.Cause.RemoteCause.class)
        if ( cause != null ) {
            name = cause.getShortDescription()
        } else {
            name = "UNKNOWN"
        }
    }

    return name
}
