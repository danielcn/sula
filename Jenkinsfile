pipeline {
   agent any

    parameters {
      string description: 'Docker image tag', name: 'image', defaultValue: 'image here', trim: true
    }

    stages {
      stage('Prep build') {
        steps {
          echo 'code here'
        }
      }
      
      stage('Testing script') {
        steps {
         sh '''#!/bin/bash
          pwd
          ls -la
         '''
        }
      } 
    }
}
