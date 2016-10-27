package castro.hitchings.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Created by evanhitchings on 10/25/16.
 */
@Entity
@Table(name="Employees")
public class Employee {
    private String firstName;
    private String lastName;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int employeeID;

    public Employee(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }


    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
