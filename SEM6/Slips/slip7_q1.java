import java.util.*;

class RandomThread extends Thread{

    private int n;
    public void run()
    {
        Random r=new Random();
        for(int i=1;i<=10;i++){
            n=r.nextInt(1000);
            if(n%2==0){
                Square sq=new Square(n);
                sq.start();
            }
            else{
                Cube cb=new Cube(n);
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
class Square extends Thread{
    private int n;
    public Square(int n){
        this.n=n;
    }

    public void run(){
        System.out.println("Square of "+n+" is "+(n*n));
    }
}

class Cube extends Thread{
    private int n;
    public Cube(int n){
        this.n=n;
    }

    public void run(){
        System.out.println("Cube of "+n+" is "+(n*n*n));
    }
}

public class slip7_q1{
    public static void main(String[] args){
        RandomThread t1=new RandomThread();
        t1.start();
    }
}