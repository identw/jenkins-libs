def call() {
    def build = currentBuild.rawBuild
    def cause = build.getCause(hudson.model.Cause.UserIdCause.class)
    
    def i = 0;
    while (i < 3) {
        if ( cause ) {
            return cause.getUserName()
        }

        cause = build.getCause(hudson.model.Cause.RemoteCause.class)
        if ( cause ) {
            return cause.getShortDescription()
        } 

        cause = build.getCause(hudson.model.Cause.UpstreamCause.class) 
        if ( cause ) {
            def job = Jenkins.instance.getItemByFullName(cause.getUpstreamProject())
            def buildId = cause.getUpstreamBuild() 
            build = job.getBuildByNumber(buildId)

            cause = build.getCause(hudson.model.Cause.UserIdCause.class)
            i++
            continue
        }
        i++
    }

    return 'UNKNOWN'
}
