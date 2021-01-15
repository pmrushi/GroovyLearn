def list = [10, 11, 12, 13, 14]

//list.each {println it}

list.add(23)
list << 40

def mapc = {map ->
    println 'testing'
    map >= 12}
println mapc(12)

def all = list.findAll { map -> map >= 12 }
//println list
//println all
