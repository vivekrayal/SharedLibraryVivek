def add(a,b){
  echo "This is check add"
  echo "addition of ${a} and ${b} is ${a+b}"
}

def mul(a,b){
  echo "This is check mul"
  echo "mul of ${a} and ${b} is ${a*b}"
}

def teamName(){
  echo "This is SnatakF4"

}

def checkoutRepo()
{
  echo "Hi"
  //checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vivekrayal/SharedLibraryVivek.git']]])
      
}

def checkTest(Map stepParams){
echo "chceking the Test"
  REPO_BRANCH="${stepParams.REPO_BRANCH}"
    REPO_URL="${stepParams.REPO_URL}"
echo "url passed is $REPO_URL"
echo "branch is $REPO_BRANCH"
  checkout([$class: 'GitSCM', branches: [[name: "*/${REPO_BRANCH}"]], extensions: [], userRemoteConfigs: [[url: "${REPO_URL}"]]])  
}

def checkTest1(Map stepParams){
echo "chceking the Test"
  REPO_BRANCH1="${stepParams.REPO_BRANCH1}"
    REPO_URL1="${stepParams.REPO_URL1}"
echo "url passed is $REPO_URL1"
echo "branch is $REPO_BRANCH1"
  //checkout([$class: 'GitSCM', branches: [[name: "*/${REPO_BRANCH}"]], extensions: [], userRemoteConfigs: [[url: "${REPO_URL}"]]])  
}
