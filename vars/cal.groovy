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

def checkout()
{
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vivekrayal/SharedLibraryVivek.git']]])
      
}
