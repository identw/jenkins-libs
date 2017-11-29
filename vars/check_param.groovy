def call (param) {
//    if ( ! binding.hasVariable(param) ) {
//        echo "Not set variable ${param}"
//        currentBuild.displayName = "#${BUILD_NUMBER} Not set variable ${param}"
//        currentBuild.description = "Not set variable ${param}"
//        currentBuild.result = 'FAILURE'
//    }

    println binding.variables.inspect()

}
