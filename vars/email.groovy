def success() {

      sendemail("SUCCESS" )

}

def failed() {
      
      sendemail("FAILED" )

}


def sendemail(status) {

      echo "jenkins job ${status} ${appVer}"
      body = "jenkins job ${status} \n " +
                " job name : ${JOB_NAME} \n " +
                " Version : ${appVer} \n " +
                " Jenkins : ${BUILD_URL} \n " +
                " Commit Message : ${lastCommitMessage} "
      emailext body: body,
                subject: "jenkins job ${appVer} was deployed ${status}",
                to: 'saravanan.resume@gmail.com',
                from: 'jenkins'

}
