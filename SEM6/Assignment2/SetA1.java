class ThreadTest extends Thread{
    private String msg;
    private int n;
    public ThreadTest(String msg,int n){
        this.msg=msg;
        this.n=n;
    }

    public void run(){
        for(int i=1;i<=n;i++){
            System.out.println(msg);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){ 

            }
        }
    }
}

public class SetA1 {
    public static void main(String[] args) throws InterruptedException 
    {
        ThreadTest t1=new ThreadTest("COVID19",10);
        ThreadTest t2=new ThreadTest("LOCKDOWN2020",20);
        ThreadTest t3=new ThreadTest("VACCINATED2021",30);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}