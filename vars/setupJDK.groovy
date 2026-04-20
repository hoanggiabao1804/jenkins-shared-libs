def call() {
    sh '''
    echo "Setting up JDK 25"
    export JAVA_HOME=/usr/lib/jvm/java-25-openjdk
    java -version
    '''
}