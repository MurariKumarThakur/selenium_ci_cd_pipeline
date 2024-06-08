pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                sh '''
                    # Install Chrome
                    wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
                    sudo apt install -y ./google-chrome-stable_current_amd64.deb

                    # Install ChromeDriver
                    CHROME_DRIVER_VERSION=$(curl -sS chromedriver.storage.googleapis.com/LATEST_RELEASE)
                    wget -N https://chromedriver.storage.googleapis.com/$CHROME_DRIVER_VERSION/chromedriver_linux64.zip
                    unzip chromedriver_linux64.zip
                    sudo mv -f chromedriver /usr/local/bin/chromedriver
                    sudo chmod 0755 /usr/local/bin/chromedriver
                '''
            }
        }

        stage('Test') {
            steps {
                sh 'java -cp your-test-jar-file.jar your.package.TestClass'
            }
        }
    }
}
