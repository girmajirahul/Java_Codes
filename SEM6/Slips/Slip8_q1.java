import java.io.*;

class Thread10 extends Thread
{
    private String msg;
    private int n;

    public Thread10(String msg,int n)
    {
        this.msg=msg;
        this.n=n;
    } 
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+" "+msg);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.print(e);
            }
        }
    }
}

class ThreadCovid
{
    public  static void main(String[] args)
    {
        Thread t1=new Thread10("COVID-19",10);
        Thread t2=new Thread10("LOCKDOWN-2020",10);
        Thread t3=new Thread10("VACCINATED-2021",10);
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}