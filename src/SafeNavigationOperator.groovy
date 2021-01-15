class Company {
    Address address
    String name
}

class Address {
    Street street
    String postalCode
    String city
}

class Street {
    String name
    String number
    String additionalInfo
}

Company company = new Company();

// company can be null.
if (company != null && company.getAddress() != null && company.getAddress().getStreet() != null) {
    println company.address.street.name
}

// println(company.address.street.name)

// company can be null.
println company?.address?.street?.name

// If one of the objects was null, the output of the total statement is null.
// We will not get any NullPointerExceptions.

