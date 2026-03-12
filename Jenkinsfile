pipeline {
    agent any

environment {
PATH="C:/maven/apache-maven-3.9.13/bin:$PATH"
}
    stages {
        stage('build') {
            steps {
                echo 'Building the application'
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
