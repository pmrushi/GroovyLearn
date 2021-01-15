import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.MapConstructor
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import org.junit.platform.commons.util.ToStringBuilder

class Dept {
    String name;
}

@MapConstructor(includeSuperFields  = true)
@ToString(includeNames = true)
@Builder
class Emp {

    String fname
    String lname
    String f1
    String l1
}

def map = [fname: "suresh", lname: "v"]
def emp = new Emp.EmpBuilder();
emp.fname("Suresh").lname("L").f1("f").build();
emp.setFname()
emp.setLname()
emp.fname = 'sures1'
println emp.toString()