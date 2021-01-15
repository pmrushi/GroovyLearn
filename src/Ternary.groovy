// First an example using the elvis operator.
def a = null

// a = a ?: 100
println (a == null ? 100 : a)

println " 1 = $a"

// Now we can shorten the assignment using the
// elvis assignment operator.
a = null
//a ?= 100

assert a == 100

b = 200
//b ?= 100

assert b == 200

// The elvis assignment operator can also
// be useful in maps to set default values.
def m = [a: 1, b: 2]
m.a = 100
m.b ?= 200
m.c ?= 300

assert m.a == 100
assert m.b == 2
assert m.c == 300

class Email {
    String to, from, subject, body
}

//def mail = new Email(to: 'test@mrhaki.com',
//        subject: 'Sample',
//        body: 'Trying Elvis assignment.')

def mail = new Email()

mail.setTo('test@mrhaki.com')
mail.setSubject('Sample')
mail.setBody('Trying Elvis assignment.')

mail.subject ?= 'Mail has no subject'
mail.from ?= 'no-reply@mrhaki.com' // mail.from == null ? 'no-reply@mrhaki.com' : mail.from
//println(mail.from == null ? 'no-reply@mrhaki.com' : mail.from)

println(mail.getTo()) // 'test@mrhaki.com'
println(mail.getFrom()) // 'no-reply@mrhaki.com'
println(mail.getSubject()) //'Sample'
println(mail.getBody()) // 'Trying Elvis assignment.'
