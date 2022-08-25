pipeline {
     agent any
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                def annoTree = sh(script: "git log --pretty=oneline --pretty=format:"%cn | %h | %s"")
                 echo "Annotated Tag: ${annoTree}"
                
            }
        }
    }
}
