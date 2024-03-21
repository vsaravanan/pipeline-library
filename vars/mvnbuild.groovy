def call() {
    sh "mvn clean package install -T 1C"
}