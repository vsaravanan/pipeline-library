def success( appVer, lastCommitMessage) {

      sendmsg( appVer, lastCommitMessage, "SUCCESS" )

}

def failed( appVer, lastCommitMessage) {
      
      sendmsg( appVer, lastCommitMessage, "FAILED" )

}


def sendmsg( appVer, lastCommitMessage, status) {

      // echo "jenkins job ${status} ${appVer}"
      // body = "jenkins job ${status} \n " +
      //           " job name : ${JOB_NAME} \n " +
      //           " Version : ${appVer} \n " +
      //           " Jenkins : ${BUILD_URL} \n " +
      //           " Commit Message : ${lastCommitMessage} "
      // emailext body: body,
      //           subject: "jenkins job ${appVer} was deployed ${status}",
      //           to: 'saravanan.resume@gmail.com',
      //           from: 'jenkins'

}
