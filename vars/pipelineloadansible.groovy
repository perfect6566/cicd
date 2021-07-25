#!groovy
import org.cicd.ansible.ansible
import org.cicd.tools.PrintTools
def call(name){
 echo "hello ${name}"
 
 pipeline {

agent {
label "awscloudagent"
}
stages{
stage("build"){
steps{
script{
def ansible = new ansible()
ansible.AnsibleDeploy("127.0.0.1","-m ping")
def tools = new PrintTools()
PrintTools.PrintMes("我成功了")
}

}



}
}

} 
}
