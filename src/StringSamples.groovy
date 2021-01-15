
def s1 = 'a single-quoted string'

def s2 =  "a double-quoted string $s1"

def s3 = '''a triple-single-quoted 
    string
        example
'''

println(s1)
println(s2)
println(s3)

def person = [name: 'Guillaume', age: 36]
println("$person.name is $person.age years old")

def name = 'Groovy'
def template = """
    Dear Mr ${name},
    
    You're the winner of the lottery!
    
    Yours sincerly,
    Dave
"""
println(template)
