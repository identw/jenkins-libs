def call(string) {
    def bool = false
    switch (string) {
        case 'false':
            bool = false
            break
        case 'true':
            bool = true
            break
        default:
            bool = false
            break
    }

    return bool
}
