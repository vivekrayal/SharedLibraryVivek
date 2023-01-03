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

def checkout(branch,url)
{
  checkout([$class: 'GitSCM', branches: [[name: "*/{$branch}"]], extensions: [], userRemoteConfigs: [[url: "{$url}"]]])
      
}
