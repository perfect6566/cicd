@Library('mylibs@main') _
pipelineloadansible "127.0.0.1"

pipeline {

agent any
stages("build"){
steps{
script{
def ansible = new org.cicd.ansible.ansible()
ansible.AnsibleDeploy("127.0.0.1","-m ping")

}

}



}


}
