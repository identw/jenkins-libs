def call(dirs) {
    def not_remove_dirs = '(' + dirs[0]
    for (i = 1; i < dirs.size(); i++) {
        not_remove_dirs = not_remove_dirs + '|' + dirs[i]
    }
    not_remove_dirs = not_remove_dirs + ')'
    return not_remove_dirs
}
