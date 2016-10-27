package castro.hitchings.Entity;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by evanhitchings on 10/25/16.
 */
@Entity
@Table(name="Timecards")
public class TimeCard {

    private int employeeID;
    private Date day;
    private Date timeIn;
    private Date timeOut;

    @Transient
    private final SimpleDateFormat formatDay = new SimpleDateFormat("yyyy-MM-dd");
    private final SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm");


    public TimeCard(int employeeID, String timeIn, String timeOut, String day)throws ParseException{
        this.employeeID = employeeID;
        this.timeIn = formatTime.parse(timeIn);
        this.timeOut = formatTime.parse(timeOut);
        this.day = formatDay.parse(day);
    }

    public TimeCard() {
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public Date getDay() {
        return day;
    }
}
