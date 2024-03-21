def call() {

      def jenkinsConfig = env.jenkins_config_home

      jenkinsConfig = "${jenkinsConfig}/${JOB_NAME}"
      echo "JENKINS_CONFIG: ${jenkinsConfig}"

      echo "JAVA_HOME: ${JAVA_HOME}"
      echo "JOB_NAME : ${JOB_NAME}"                // tutonui
      echo "BUILD_URL : ${BUILD_URL}"              // https://web.saravanjs.com/job/tutonui/60/
      echo "JENKINS_HOME : ${JENKINS_HOME}"        // /var/lib/jenkins
      echo "WORKSPACE : ${WORKSPACE}"              // /var/lib/jenkins/workspace/tutonui
      echo " abc : ${abc} " 

}