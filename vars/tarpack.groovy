def call() {
     sh "cd ${JENKINS_HOME}/workspace; pwd; tar -czf ${WORKSPACE}.tar.gz ${JOB_NAME}"
}