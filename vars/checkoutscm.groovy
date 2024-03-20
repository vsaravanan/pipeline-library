def call() {

    checkout scm
    gitCommit = sh(returnStdout: true, script: 'git rev-parse HEAD').trim()

    echo "gitCommit : ${gitCommit}"

    gitVersion = sh(returnStdout: true, script: 'git rev-list HEAD --count').toString().trim()
    echo "gitVersion: ${gitVersion}"

    lastCommitMessage = sh(returnStdout: true, script: 'git log -1 --format="%s" ').toString().trim()
    appVer = "${JOB_NAME}.${BUILD_ID}.git-${gitVersion}"
    echo "lastCommitMessage: ${lastCommitMessage} "

    echo "appVer: ${appVer}" // tutonui.60.git-47
    return [appVer, lastCommitMessage];
}