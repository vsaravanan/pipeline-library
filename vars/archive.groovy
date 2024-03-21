def call() {
      sshagent(['ecdsa']) {
        sh "ssh viswar@sjsapp bash /data/scripts/archive.sh ${JOB_NAME} ${appVer} --error"
      }
}