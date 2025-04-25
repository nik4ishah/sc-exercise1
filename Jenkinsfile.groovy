pipeline {
    agent any
    tools {
        nodejs "Node 18.x"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building Hello App...'
                sh 'echo Simulating build step...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running Tests...'
                sh 'node test.js'
            }
        }
    }
}
