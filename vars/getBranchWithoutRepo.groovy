def call(branch) {
    // TODO catch all remotes: git remote -v | cut -f1 | sort | uniq
    if ( branch.contains('origin') ) {
        return branch.split('/').drop(1).join('/')
    }
    return branch
}
