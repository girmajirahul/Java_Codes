/**
 Write a Multithreading program in java to display the number’s between 1 to 100 continuously  
 and also for Even number and Odd Numbers . (use Runnable Interface)
 */

class NumberPrinter implements Runnable {
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.print(i+"  ");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Error:"+e.getMessage());
            }
        }
    }
}

class EvenNumbers implements Runnable{
    public void run(){
        System.out.println("Even numbers:");
        for(int i=2;i<=100;i++){
            if(i%2==0){
                System.out.print(i+"  ");
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.print(e.getMessage());
            }
        }
    }
}

class OddNumbers implements Runnable{
    public void run(){
        System.out.println("Odd numbers:");
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+"  ");
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.print(e.getMessage());
            }
        }
    }
}

class Multithread{
    public static void main(String[] args){
        Thread t1=new Thread(new NumberPrinter());
        Thread t2=new Thread(new EvenNumbers());
        Thread t3=new Thread(new OddNumbers());
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}