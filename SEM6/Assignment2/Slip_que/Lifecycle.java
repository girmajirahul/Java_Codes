//Program to show LifeCycle of a thread
//print name of thread and value of sleep-time
//name should be hardcoded through constructor
//sleep-time should be random integer between 0 to 4999

import java.util.Random;

class RandomName extends Thread
{
    public RandomName()
    {
        super("Random Thread");
    }

    public void run()
    {
        Random r=new Random();
        for(int i=1;i<=10;i++)
        {
            int time=r.nextInt(4999);
            try
            {
                //Sleep Phase
                Thread.sleep(time);
            }
            catch(InterruptedException e)
            {}

            System.out.println("Name of the Thread: "+this.getName());
            System.out.println("Sleep-Time of Thread: "+time);
            System.out.println();

            //Death Phase
        }
    }
}

public class Lifecycle
{
    public static void main(String[] args)
    {
        //Creation Phase
        RandomName rn=new RandomName();

        //Execution/Running Phase
        rn.start();
    }
}