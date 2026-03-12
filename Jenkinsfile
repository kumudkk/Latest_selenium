pipeline {
    agent any

environment {
PATH="C:/maven/apache-maven-3.9.13/bin:$PATH"
}
    stages {
        stage('git clone') {
            steps {
                git credentialsId:'kumudkk (selenium_ssh)', url:'git@github.com:kumudkk/Latest_selenium.git'
            }
        }
          stage('test') {
            steps {
                echo 'Testing the application'
                sh "mvn test"
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying the application'
            }
        }
    }
}
