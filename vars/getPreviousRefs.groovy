def call(currentbuild) {
    return currentbuild.previousBuild.getRawBuild().getSCMs()[0].getBranches().toArray()
}
