//MultiThread Application - Three Threads
// First thread - Generates a random integer (After 1 second)
// Second Thread - Computes square if First Thread is even
// Third Thread - Computes cube if First Thread is odd
import java.util.Random;

class RandomThread extends Thread
{
        private int n;
    public void run()
    {
        Random r=new Random();
        for(int i=1;i<=10;i++)
        {
            n=r.nextInt(100);
            if(n%2==0)
            {
                Square s=new Square(n);
                s.start();
            }
            else
            {
                Cube c=new Cube(n);
                c.start();
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}

class Square extends Thread
{
    private int n;
    
    public Square(int n)
    {
        this.n=n;
    }

    public void run()
    {
        System.out.println("Number: "+n);
        System.out.println("Square: "+n*n);
        System.out.println();
    }
}

class Cube extends Thread
{
    private int n;
    
    public Cube(int n)
    {
        this.n=n;
    }

    public void run()
    {
        System.out.println("Number: "+n);
        System.out.println("Cube: "+n*n*n);
        System.out.println();
    }
}

public class ThreeThread
{
    public static void main(String[] args)
    {
        RandomThread rt=new RandomThread();
        rt.start();
    }
}