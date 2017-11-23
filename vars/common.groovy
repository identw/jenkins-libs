def git_clean(all = false) {
    if (all) {
        sh 'git clean -X -f -f -d'
        sh 'git clean -f -f -d && git checkout .'
    } else {
        sh 'git clean -f -d && git checkout .'
    }
}

def random_string() {
    def tmp = sh returnStdout: true, script: 'echo -n "`cat /dev/urandom | tr -dc \'a-zA-Z0-9\' | fold -w 32 | head -n 1`"'
    return tmp
}
