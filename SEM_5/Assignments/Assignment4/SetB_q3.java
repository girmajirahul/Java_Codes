import java.util.Scanner;
class InvalidDateException extends Exception
{
    public String tostring()
    {
        return "Invalid Date is given";
    }
}
class InvalidMonthException extends Exception
{
    public String tostring()
    {
        return "Invalid Month is given";
    }
}

class UserDefinedException
{
    public static void main(String[] args)
    {
        try
        {
            if(args.length < 3)
                throw  new NullPointerException();
            else
            {
                int dd=Integer.parseInt(args[0]);
                int mm=Integer.parseInt(args[1]);
                int yy=Integer.parseInt(args[2]);
                boolean leap=((yy%400==0) || (yy%40==0) && (yy%100!=0));
                if(mm <1 || mm>12)
                    throw new InvalidMonthException();
                switch(mm)
                {
                    case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        if(dd <1 || dd>31)
                            throw new InvalidDateException();
                        break;
                    case 2:
                        if(leap && dd>29)
                            throw new InvalidDateException();
                        break;
                    case 4:case 6:case 11:
                        if(dd<1 || dd >30)
                            throw new InvalidDateException();
                }
                System.out.println("Valid Date is "+dd+" "+mm+" "+yy+" ");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

