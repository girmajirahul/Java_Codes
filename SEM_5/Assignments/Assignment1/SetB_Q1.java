import java.util.*;
import java.text.*;

 class calender {
  public static void main(String[] args){
  
    Date d=new Date();
    SimpleDateFormat s;
    s= new SimpleDateFormat("dd/MM/yyy");
    System.out.println("The current date is:"+s.format(d));
    s= new SimpleDateFormat("dd-MM-yyy");
    System.out.println("The current date is:"+s.format(d));
    s= new SimpleDateFormat(" EEEE dd MM yyy");
    System.out.println("The current date is:"+s.format(d));
    System.out.println("The current date and time:"+d);
    s=new SimpleDateFormat("dd/MM/yyy hh:mm:ss aa Z");
    System.out.println("The current date and time:"+s.format(d));
    s=new SimpleDateFormat("hh:mm:ss aa");
    System.out.println("The current time :"+s.format(d));

    Calendar c=Calendar.getInstance();
    c.setTime(d);
    System.out.println("The current weak of year:"+c.get(Calendar.WEEK_OF_YEAR));
    System.out.println("The current week of month:"+c.get(Calendar.WEEK_OF_MONTH));
    System.out.println("The current day of year:"+c.get(Calendar.DAY_OF_YEAR));
  }
}