def call() {
    withSonarQubeEnv() {
        sh "mvn clean verify sonar:sonar -Dsonar.projectKey=saravanjs-project -Dsonar.projectName='saravanjs-project'"
    } 
}