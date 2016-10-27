package castro.hitchings.Controllers;

import castro.hitchings.DAO.EmployeeDatabase;
import castro.hitchings.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by evanhitchings on 10/26/16.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeDatabase employeeDatabase;

    @RequestMapping(value="/employee", method = RequestMethod.POST)
    public @ResponseBody Employee addEmployee(@RequestBody Employee employee){
        employeeDatabase.save(employee);
        return employee;
    }

    @RequestMapping(value="/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees(int employeeID){
        return employeeDatabase.getEmployees();
    }


}
