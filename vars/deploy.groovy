def call() {
     sshagent(['ecdsa']) {
          sh 'scp ${WORKSPACE}.tar.gz viswar@sjsapp:/data/tmp'
     }
}