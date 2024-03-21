def call() {
     sh "cd ${jenkinsRoot}; pwd; tar -czf ${WORKSPACE}.tar.gz ${JOB_NAME}"
}