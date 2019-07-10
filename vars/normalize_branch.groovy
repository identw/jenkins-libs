def call(branch) {
    return branch.replaceAll(/[^a-z0-9]/,'-')
}
