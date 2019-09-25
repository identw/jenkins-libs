def call(branch) {
    if ( branch.contains('origin') ) {
        branch = branch.split('/').drop(1).join('/')
    }
    return branch.toLowerCase().replaceAll("[^a-z0-9]", '-')
}
