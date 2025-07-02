import java.io.*;

class Producer_consumer extends Thread{
    private Thread th1,th2;
    private int i;

    public Producer_consumer(){
        th1=new Thread(this,"Producer");
        th2=new Thread(this,"Consumer");       
        th1.start();
        th2.start();
    }

    public void run(){
        while(true){
            if(Thread.currentThread()==th1){
                synchronized(this)
                {
                    produce();
                    display();
                    if(i==50){
                        notifyAll();
                        try{
                            wait();
                        }
                        catch(InterruptedException e){
                            System.out.println(e);
                        }
                    }
                }
            }
            if(Thread.currentThread()==th2){
                synchronized(this){
                    consume();
                    display();
                    if(i==0){
                        notifyAll();
                        try{
                            wait();
                        }
                        catch(InterruptedException e){
                            System.out.println(e);
                        }
                    }
                }
            }
        }
    }

    public void produce()
    {
        i=i+10;
    }
    public void consume()
    {
        i=i-10;
    }
    public void display()
    {
        if(Thread.currentThread()==th1){
            System.out.println("Producer produce "+i);
        }
        else if(Thread.currentThread()==th2){
            System.out.println("Consumer consumes "+i);
        }
    }

    public static void main(String[] args){
        new Producer_consumer();
    }
}