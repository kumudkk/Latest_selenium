pipeline {
    agent any

    tools {
        maven 'Maven 3.x' 
        jdk 'JDK 22'
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
                sh 'mvn test'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying the application'
            }
        }
    }
}
