def myIntRage = 6..<10

println "Size is: ${myIntRage.size()}"
println "Item at index 2 is: ${myIntRage.get(2)}"
println "Does it contain 8?: ${myIntRage.contains(8)}"
println "Does it contain 11?: ${myIntRage.contains(11)}"
println "Does it contain 7 and 10?: ${myIntRage.containsAll([7, 10])}"
println "Does it contain 9 and 12?: ${myIntRage.containsAll([9, 12])}"
println "What is the index of the item with vaue 7?: ${myIntRage.indexOf(7)}"
println "Is the list empty?: ${myIntRage.isEmpty()}"

for (n in myIntRage) {
    println n
}

def myIntRange = 21..25
myIntRange.each { n ->
    println n
}

