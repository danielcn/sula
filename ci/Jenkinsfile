pipeline {
  agent any

  parameters {
    string description: 'Docker image tag', name: 'image', defaultValue: 'image here', trim: true
  }
  
  agent {
    docker {
      image 'hseeberger/scala-sbt'
    }
  }

  stages {
    stage('Prep build') {
      steps {
        checkou scm
      }
    }

    stage('Build') {
      steps {
          echo "Compiling..."
          sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/usr/local/bin/sbt compile"
      }
    }

    stage('Unit Test') {
      steps {
        echo "Testing..."
        sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt test"
        sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt scalastyle"
      }
    }

    stage('Docker Publish') {
      steps {
        sh ${tool name: 'sbt', type: "org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt docker:publishLocal"
      }
    }
  }
}
