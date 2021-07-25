#!groovy



def call(hosts){
 

pipeline
{
     agent {  label "master"  }
     
     stages{
         stage("build"){
           steps {
              script {
             def ansible=new org.cicd.ansible()

                   ansible.AnsibleDeploy("${hosts}","-m ping")      
                 
              }
            }
         }
     }
     
     
   post {
        always {
             script{
                  def tools=new org.cicd.tools()
                  tools.PrintMes("1.1.1.1")
             }
        }
   }     
}
}
