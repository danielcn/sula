pipeline {
  agent any

  parameters {
    string description: 'Docker image tag', name: 'image', defaultValue: 'image here', trim: true
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

    stage('Testing script') {
      steps {
        sh '''#!/bin/bash
        '''
      }
    }  
  }
}
