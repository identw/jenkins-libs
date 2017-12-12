def call(dirs) {
    def i
    def revs
    for (i = 0; i < dirs.size(); i++) {
        dir(dirs[i]) {
            def sh_return = sh returnStdout: true, script: 'svn info --show-item last-changed-revision'
            revs.put( dirs[i], sh_return )
        }
    }
    return revs
}
