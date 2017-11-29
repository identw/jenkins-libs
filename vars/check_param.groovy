def call (param) {
//    if ( ! binding.hasVariable(param) ) {
//        echo "Not set variable ${param}"
//        currentBuild.displayName = "#${BUILD_NUMBER} Not set variable ${param}"
//        currentBuild.description = "Not set variable ${param}"
//        currentBuild.result = 'FAILURE'
//    }

    for(int i=0; i < binding.variables.size(); i++) {
        println binding.variables[i]
    }
}
