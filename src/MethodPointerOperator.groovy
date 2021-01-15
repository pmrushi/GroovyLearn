class Arithmetic {
    int sum(int a, int b){
        return a + b
    }

    int sub(int a, int b){
        return a - b
    }
}

Arithmetic obj = new Arithmetic();

def addition = obj.&sum // Refer sum function of obj
def subtraction = obj.&sub // Refer sub function of obj

int result1 = addition(10, 20)
int result2 = subtraction(10, 20)

println "Sum of 10 and 20 is ${result1}"
println "Subtraction of 10 and 20 is ${result2}"