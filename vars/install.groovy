def call() {
      withCredentials([string(credentialsId: 'colordust', variable: 'colordust')]) {
        sshagent(['ecdsa']) {
          sh 'ssh viswar@sjsapp bash /data/scripts/install.sh ${JOB_NAME} ${colordust} --error'
        }
      }
}