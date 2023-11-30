pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven'
        COMPLAINT_URL = 'https://4f5ac991-f23a-4e1f-8497-65f31136e50f.mock.pstmn.io'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/surya-siddhi-sai-2710/Complaint-API.git'
            }
        }

        stage('Build') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn clean install"
            }
        }

        stage('Test') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('Deploy') {
            steps {
                // Example: Deploy to a server (replace with your deployment steps)
                sh 'scp target/complaint-api.jar user@your-server:/path/to/deployment/'
            }
        }
    }

    post {
        success {
            echo "Build succeeded! Deploying to production. Complaint URL: ${COMPLAINT_URL}"
        }

        failure {
            echo 'Build failed. Notify the team and take corrective actions.'
        }
    }
}
