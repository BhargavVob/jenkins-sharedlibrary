def call(){
    echo "job Name:${env.JOB_NAME}"
    echo "Build Number:${env.BUILD_NUMBER}"
    echo "Workspace Path:${env.WORKSPACE}"
}