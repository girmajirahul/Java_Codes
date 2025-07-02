import java.util.*;
import java.text.*;

class date
{
    public static void main(String[] args)
    {
        Date d=new Date();
        SimpleDateFormat s;
        s=new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Current date is :"+s.format(d));
        s=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Current date is :"+s.format(d));
        s=new SimpleDateFormat("EEEE dd MM yyyy");
        System.out.println("Current data is :"+s.format(d));
        s=new SimpleDateFormat("hh:mm:ss aa");
        System.out.println("The current time :"+s.format(d));
        s=new SimpleDateFormat("dd//MM/yyyy hh:mm::ss aa Z");
        System.out.println("Current date and time is :"+s.format(d));



    }

}