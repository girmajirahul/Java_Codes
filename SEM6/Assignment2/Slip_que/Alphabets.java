//program to display all the alphabets between A to Z after every 2 seconds

public class Alphabets 
{
    public static void main(String[] args)
    {
        for(char ch='A'; ch<='Z';ch++)
        {
            System.out.println(ch);
             try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}
