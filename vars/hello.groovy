def call(name) {
    sh "echo ${name} hello world"
}

def addNumbers(int num1, int num2) {
    return num1 + num2
}