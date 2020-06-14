pipeline {
    agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "maven"
   }

   stages {
        stage('git clone') {
            steps {
		        sh 'cd /var/jenkins_home/workspace/emart_jenkins/'
                sh 'mkdir -p Module1'
                dir("Module1"){
                    git branch: "master",
                    credentialsId: '0a29b9ea-c299-480c-ab6c-d2f4a3c2c500',
                    url: 'https://github.com/olgayue78/EMart.git'
                }
                sh 'ls -al Module1'
            }
        }
     stage('Build') {
         steps {
            sh "mvn -f /var/jenkins_home/workspace/emart_jenkins/Module1/eureka-server/pom.xml"
         }
      }

        stage('Deploy') {
            agent { 
                dockerfile {
                    filename 'Dockerfile'
                    dir '/var/jenkins_home/workspace/emart_jenkins/Module1/eureka-server/target'
                    additionalBuildArgs  '--tag eureka-server:v1.0'
             } 
                
            }
            steps {
               echo 'Deploy OK'
            }
        }

        stage('startup') {
            agent  any
            steps {
               sh 'docker run --name eureka-service -d -p 8761:8761  eureka-server:v1.0'
            }
        }


   }
    post {
        failure {
           echo 'pipline failue'
        }
    }
}