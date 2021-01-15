def code = { 123 }
println(code)
println(code.call())
println(code())

def isEven = {i -> i%2 == 0} // parameters
println(isEven.call(4))
println(isEven(5))

def isOdd = {it%2 != 0} // implicit argument (it)
println(isOdd.call(4))
println(isOdd(5))

def closureWithOneArg = { str -> str.toUpperCase() }
assert closureWithOneArg('groovy') == 'GROOVY'

def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

def closureWithTwoArgs = { a,b -> a+b }
assert closureWithTwoArgs(1,2) == 3

def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a+b }
assert closureWithTwoArgsAndExplicitTypes(1,2) == 3

def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
assert closureWithTwoArgsAndOptionalTypes(1,2) == 3

def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
assert closureWithTwoArgAndDefaultValue(1) == 3


def greeting = { "Hello, $it!" }
assert greeting('Patrick') == 'Hello, Patrick!'

def greetingImplicit = { it -> "Hello, $it!" }
assert greeting('Patrick') == 'Hello, Patrick!'

def clos = {println("this is closure function")}

def passClosure(closure) {
    closure.run()
    closure.call()
    closure()
}

passClosure(clos)