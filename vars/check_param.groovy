def call (param) {
    try {
        println Eval.me(param)
    } catch(e) {
        echo "Not set variable ${param}"
        currentBuild.displayName = "#${BUILD_NUMBER} Not set variable ${param}"
        currentBuild.description = "Not set variable ${param}"
        currentBuild.result = 'FAILURE'
    }
}