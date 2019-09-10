def call() {
    def build = currentBuild.rawBuild
    def cause = build.getCause(hudson.model.Cause.UserIdCause.class)

    if ( cause ) {
        return cause.getUserName()
    }

    cause = build.getCause(hudson.model.Cause.RemoteCause.class)
    if ( cause ) {
        return cause.getShortDescription()
    } 
    
    cause = build.getCause(hudson.model.Cause.UpstreamCause.class) 
    if ( cause ) {
       return cause.getShortDescription() 
    }

    return 'UNKNOWN'
}
