pipeline {
     agent any
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                
            }
        }
         stage('Checkout code') {
            steps {
                git url:'https://github.com/Codingrep/helloworld.git', branch:'master'
                
            }
        }
         stage ('Build Image'){
              steps{
                   myapp = docker.build("deepanshuc33/newimage:${env.BUILD_ID}")
              }
         }
    }
}
