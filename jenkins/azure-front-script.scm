node {
    def remote = [:]
    remote.name = 'front'
    remote.host = '20.120.10.138'
    remote.user = 'azureuser'
    remote.allowAnyHosts = true
    
    withCredentials([file(credentialsId: 'keyssh', variable: 'secretKey')]){
        remote.identityFile = secretKey
        stage ('Remote SSH') {
            writeFile file: 'hello.sh', text: 
            "docker login teachua.azurecr.io -u teachua -p ${TeachPassword}\ndocker pull teachua.azurecr.io/frontend:v2.1\ndocker run --rm -p 3001:3000 -d --name teachUAFront teachua.azurecr.io/frontend:v2.1"
            sshScript remote: remote, script: "hello.sh"
        }
    }
    
}
