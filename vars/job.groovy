def call(String repoUrl) {
  sh '''
  mvn --version
  java -version
  '''
}          
