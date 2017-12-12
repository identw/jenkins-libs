def call(dirs) {
    def i
    def revs
    for (i = 0; i < dirs.size(); i++) {
        dir(dirs[i]) {
            revs.put( dirs[i], sh returnStdout: true, script: 'svn info --show-item last-changed-revision' )
        }
    }
    return revs
}
