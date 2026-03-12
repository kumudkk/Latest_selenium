pipeline {
    agent any

environment {
GIT_SSH_COMMAND = 'ssh -o StrictHostKeyChecking=no' // Skip host key checking   

}
    tools {
        maven 'Maven 3.9.13' // Refers to the name of a Maven installation configured in Jenkins "Global Tool Configuration"
        jdk 'jdk22'      // Refers to the name of a JDK installation configured in "Global Tool Configuration"
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
