pipeline {
     agent any
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh '''
                sh 'git log --pretty=oneline --pretty=format:"%cn | %h | %s"'
                '''
                
            }
        }
    }
}
