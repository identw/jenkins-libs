def call(dirs) {
    def not_remove_dirs = '('
    for (i = 0; i < dirs.size(); i++) {
        not_remove_dirs = not_remove_dirs + '|' + dirs[i]
    }
    not_remove_dirs = not_remove_dirs + ')'
    return not_remove_dirs
}
