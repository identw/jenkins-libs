def call(branch) {
    return branch.toLowerCase().replaceAll("[^a-z0-9]", '-')
}
