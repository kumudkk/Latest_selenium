pipeline {
    agent any

environment {
GIT_SSH_COMMAND = 'ssh -o StrictHostKeyChecking=no' // Skip host key checking   
PATH="C:/maven/apache-maven-3.9.13/bin:$PATH"
}
    stages {
        stage('clone') {
            steps {
                git branch: 'master', credentialsId: 'selenium_ssh', url: 'git@github.com:kumudkk/Latest_selenium.git'
            }
        }
        stage('test') {
            steps {
                echo 'Testing the application'
                sh "mvn test"
            }
        }
    }
}
