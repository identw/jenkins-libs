def call(all = false) {
    if (all) {
        sh 'git clean -X -f -f -d'
        sh 'git clean -f -f -d && git checkout .'
        sh 'git prune'
    } else {
        sh 'git clean -f -d && git checkout .'
        sh 'git prune'
    }
}
