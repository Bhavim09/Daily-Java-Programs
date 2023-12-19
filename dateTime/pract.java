package dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class pract {
    public static void main(String[] args) throws Exception{
        String sdate = "12/05/2001";
        String pattern = "dd/MM/yyyy";
        DateFormat dateFormat = new SimpleDateFormat(pattern);

    Date date = dateFormat.parse(sdate);
    System.out.println(date);      
    Calendar cal = Calendar.getInstance();
    LocalDate curDate = LocalDate.now();
    System.out.println(curDate.with(TemporalAdjusters.firstDayOfNextMonth()));

cal.setTime(date);
System.out.println(date.getTime());  
    }
}
