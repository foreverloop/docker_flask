job('Flask_groovy_example') {
    scm {
        git('https://github.com/foreverloop/docker_flask.git','main') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    steps {
        shell(readFileFromWorkspace('start.sh'))
    }
}