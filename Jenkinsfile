pipeline {
     agent {
        docker { image 'node:16.13.1-alpine' }
    }
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
    }
}
