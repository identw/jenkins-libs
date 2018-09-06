def call() {
    def build = currentBuild.rawBuild
    def cause = build.getCause(hudson.model.Cause.UserIdCause.class)

    if ( cause ) {
        println cause.metaClass.methods*.name.sort().unique()
        return cause.getUserName()
    } else {
        cause = build.getCause(hudson.model.Cause.RemoteCause.class)
    }

    if ( cause ) {
        println cause.metaClass.methods*.name.sort().unique()
        return cause.getShortDescription()
    } else {
       cause = build.getCause(hudson.model.Cause.UpstreamCause.class)
    }

    if ( cause ) {
        println cause.metaClass.methods*.name.sort().unique()
        return cause.getShortDescription()
    }
    
    return cause_result
}
