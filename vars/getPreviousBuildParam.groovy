def call(currentbuild, paramName) {
    def build = currentbuild.previousBuild.getRawBuild()
    def param = build.getActions(hudson.model.ParametersAction)[0].getParameters().find {
        it.name == paramName
    }

//    def prevRef = build.getSCMs().getBranches()[0]
//    echo "prevRef = ${prevRef}"
    return param.getValue()
}
