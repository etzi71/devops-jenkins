pipeline {
    agent none
    stages {
        stage('Example Build') {
            agent { docker 'maven:3.5-alpine' }
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
                sh 'sleep 5m'
            }
        }
        stage('Example Test') {
            agent { docker 'openjdk:8-jre' }
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}
