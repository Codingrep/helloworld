libraries{
    pod_template{
        cloud = "prod-ucp-ca--stage-devops-jenkinsagents-ns"
    }

    maven{
        build{
            goals = "clean package"
        }

        sonar{
            goals = "sonar:sonar"
            target = "SonarQube Stage"
        }

        publish{
            snapshot{
                goals = "deploy"
                properties = '-DrepositoryUsername=$ci_publish_username -DrepositoryPassword=$ci_publish_password'
                credential = "Artifactory Prod"
            }

            release_candidate{
                goals = "deploy"
                properties = '-DrepositoryUsername=$ci_publish_username -DrepositoryPassword=$ci_publish_password'
                credential = "Artifactory Prod"
            }

            release{
                goals = "deploy"
                properties = '-DrepositoryUsername=$ci_publish_username -DrepositoryPassword=$ci_publish_password'
                credential = "Artifactory Prod"
            }
        }
    }

    msteams{
        shouldNotify = true
        channel{
            success = "https://sunlifefinancial.webhook.office.com/webhookb2/c6ce1cbf-ee24-4065-a2cb-aeff9021b944@415bb08f-1a20-4fbe-9b57-313be7050945/JenkinsCI/8428fc1dec4147fc9e35981e80bc5805/9b697be3-1070-443c-be3d-cad096737c22"
            failure = "https://sunlifefinancial.webhook.office.com/webhookb2/c6ce1cbf-ee24-4065-a2cb-aeff9021b944@415bb08f-1a20-4fbe-9b57-313be7050945/JenkinsCI/8428fc1dec4147fc9e35981e80bc5805/9b697be3-1070-443c-be3d-cad096737c22"
            unstable = "https://sunlifefinancial.webhook.office.com/webhookb2/c6ce1cbf-ee24-4065-a2cb-aeff9021b944@415bb08f-1a20-4fbe-9b57-313be7050945/JenkinsCI/8428fc1dec4147fc9e35981e80bc5805/9b697be3-1070-443c-be3d-cad096737c22"
        }
    }
}