def call() {
    sh '''
    echo "Preparing Sonar cache"
    mkdir -p ~/.sonar/cache
    '''
}