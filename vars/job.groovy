def call(String repoUrl) {
  node {
           stage("Tools initialization") {
                   sh "mvn --version"
                   sh "java -version"
               }
           stage("cloning repo") {
                   git "${repoUrl}"
               }
       }
}
