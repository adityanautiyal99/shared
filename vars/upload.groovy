def call(){
  rtServer (
                id: 'key',
                url: 'http://52f4e1510188.ngrok.io/artifactory',
                // If you're using username and password:
                username: 'admin',
                password: '6DE@Dpool9',
                // If you're using Credentials ID:
                //credentialsId: 'ccrreeddeennttiiaall',
                // Configure the connection timeout (in seconds).
                // The default value (if not configured) is 300 seconds:
                timeout: 300
                )
                
  rtUpload (
                serverId: 'key',
                spec: '''{
                      "files": [
                        {
                          "pattern": "target/*.war",
                          "target": "key/Build_${BUILD_NUMBER}/"
                        }
                     ]
                }'''
                )
}
