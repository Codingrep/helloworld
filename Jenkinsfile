pipeline {
     agent any
    stages {
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh '''
                sh 'git log --pretty=oneline --pretty=format:"%cn | %h | %s" $(git log --format='%H' $(git tag | xargs -I@ git log --format=format:"%ai @%n" -1 @ | sort -r | awk '/tagname BS-[0-9].[0-9].[0-9]$/' | awk 'NR==1{print $4}' )^HEAD | tail -1) | awk '!/Merge pull|Merge branch/{print $0}' | sort -u -t'|' -k3,3 | awk -F'[|]' '{ printf("%-20s%-15s%s\n",$1,$2,$3)}'"'
                '''
                
            }
        }
    }
}
