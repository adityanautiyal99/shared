def call(String repoUrl) {
  node {
           stage("Tools initialization") {
               steps {
                   sh "mvn --version"
                   sh "java -version"
               }
           }
           stage("Checkout Code") {
               steps {
                   git "${repoUrl}"
               }
           }
       }
}
