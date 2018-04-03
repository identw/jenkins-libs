def call(string) {
    def bool = false

    if (string.getClass() == Boolean) {
        return string
    }

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
