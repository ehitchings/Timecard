package castro.hitchings.Controllers;

import castro.hitchings.DAO.TimeCardDatabase;
import castro.hitchings.Entity.TimeCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by evanhitchings on 10/26/16.
 */
@RestController
public class TimeCardController {

    @Autowired
    TimeCardDatabase timeCardDatabase;

    @RequestMapping(value="/timecard", method = RequestMethod.POST)
    public @ResponseBody TimeCard punchTimeCard(@RequestBody TimeCard timeCard){
        timeCardDatabase.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value="/timecard", method = RequestMethod.GET)
    public List<TimeCard> getTimeCards(int employeeID){
        return timeCardDatabase.getTimeCards(employeeID);
    }
}
