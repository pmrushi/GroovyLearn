class User {
    String name

    User(String name) {
        this.name = name
    }
    String getName() {
        return "Name: $name"
        // return name
    }
}

def user = new User('Bob')
println(user.getName()) // 'Name: Bob'
println(user.@name) // 'Bob'
