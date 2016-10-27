package castro.hitchings.DAO;

import castro.hitchings.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by evanhitchings on 10/26/16.
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "Employee", path = "hr")
public interface EmployeeDatabase extends CrudRepository {


    public List<Employee> getEmployees();
    public Employee getEmployee(int employeeID);
}
