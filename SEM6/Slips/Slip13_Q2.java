import java.util.*;

class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread "+getName()+" is created");
        Random random=new Random();
        int sleepTime=random.nextInt(5000);
        try{
            System.out.println("Thread "+getName()+" will sleep for "+sleepTime +" milliseconds");
            Thread.sleep(sleepTime);
            System.out.println("Thread "+getName()+" is dead");

        }
        catch(InterruptedException e){
            System.out.print(e);
        }
    }
}
class ThreadLifeCycle{
    public static void main(String[] args){    
        Mythread t1=new Mythread("Thread1");
        Mythread t2=new Mythread("Thread2");
        t1.start();
        t2.start();
    }
}