import java.util.*;
class SumThread extends Thread
{
    private int sum,tsum=0,no;
    int[] arr =new int[1000];
    public SumThread(int no){
        this.no=no;
        Random r=new Random();
        for(int i=0;i<1000;i++){
            arr[i]=r.nextInt(1000);
        }
    }

    public void run(){
        sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+arr[no];
            no++;
        }
        System.out.println("sum is "+sum);
        tsum=tsum+sum;
    }
    public int getAverage(){
        return (tsum/10);
    }

    public static void main(String args[]) throws InterruptedException
    {
        int s=0;
        SumThread[] t=new SumThread[10];
       
            for(int i=0;i<10;i++){
                t[i]=new SumThread(s);
                t[i].start();
                t[i].join();
                s=s+100;
                
        }
    }
}

