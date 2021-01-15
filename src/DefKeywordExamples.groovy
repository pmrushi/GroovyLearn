def value
value = "str"
println(value)
value = 23
println(value)
value = [1,2,4]
println(value)

def divide(int x, int y) {
    if (y == 0) {
        return "Should not divide by 0"
    } else {
        return x/y
    }
}
println(divide(1, 0))
println(divide(4, 2))

def greetMsg() {
    println "Hello! I am Groovy"
}
greetMsg()