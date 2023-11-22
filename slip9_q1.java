import java.util.Scanner;
class Clock {

    public int Hours;
    public int Minutes;
    public int Seconds;
    public String period;
    public Clock(int Hours,int Minutes,int Seconds)
    {
        this.Hours=Hours;
        this.Minutes=Minutes;
        this.Seconds=Seconds;
    }

    public  boolean isValid(){
        return ((Hours >=0 && Hours <24));
    }

    public  void setPeriod(){
        if(Hours>=12)
            period="PM";
        else
            period="AM";
    }

    public void display(){
        if(isValid())
        {
            setPeriod();
            System.out.printf("Time: %02d:%02d:%02d %s\n",Hours,Minutes,Seconds,period);
        }
        else
            System.out.println("Invalid time !");
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the hours:");
        int hh=sc.nextInt();
        System.out.print("Enter the minutes:");
        int mm=sc.nextInt();
        System.out.print("Enter Seconds:");
        int ss=sc.nextInt();
        Clock clk=new Clock(hh,mm,ss);

       clk.display();
        
        
    }
  
}