def gitdownload(reponame)
{ 
  git "https://github.com/intelliqittrainings/${reponame}.git"
}

def buildartifact()
{
   sh "mvn package"
}
