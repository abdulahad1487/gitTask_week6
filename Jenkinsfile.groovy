pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                echo "Building code using Maven..."
                
            }
        }
        stage("Unit and Integration Tests") {
            steps {
                echo "Running unit tests..."
                
                echo "Running integration tests..."
                
            }
        }
        stage("Code Analysis") {
            steps {
                echo "Running code analysis with SonarQube..."
                
            }
        }
        stage("Security Scan") {
            steps {
                echo "Performing security scan with OWASP ZAP..."
                
            }
            post {
                always {
                    mail to: "ahad1487281999@gmail.com",
                    subject: "Security Scan Status Email",
                    body: "successfully Security Scan log attached!"
                }
            }
        }
        stage("Deploy to Staging") {
            steps {
                echo "Deploying to staging server (AWS EC2 instance)..."
                
            }
        }
        stage("Integration Tests on Staging") {
            steps {
                echo "Running integration tests on staging environment..."
                
            }
            post {
                always {
                    mail to: "ahad1487281999@gmail.com",
                    subject: "Testing Status Email",
                    body: "successfullytesting log attached!"
                }
            }
        }
        stage("Deploy to Production") {
            steps {
                echo "Deploying to production server (AWS EC2 instance)..."
                
            }
        }
    }
    
}
