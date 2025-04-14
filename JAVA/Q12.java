/*
Write a java program to define a thread for printing text on output screen for ‘n’ number of times. 
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread 
constructor. Example: 
i.	First thread prints 'COVID19' 10 times.
ii.	 Second thread prints 'LOCKDOWN2020' 20 times 
iii.      Third thread prints 'VACCINATED2021' 30 times

*/
class ThreadTest extends Thread{
     int n;
     String msg;

    public ThreadTest(int n,String msg){
        this.n=n;
        this.msg=msg;
    } 

   
    public void run(){
        for(int i=1;i<=n;i++){
            System.out.println(msg);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Error"+e.getMessage());
            }
        }
    }
}

class ThreadCovid{
    public static void main(String[] args){
        ThreadTest t1=new ThreadTest(10,"COVID19");
        ThreadTest t2=new ThreadTest(20,"LOCKDOWN20");
        ThreadTest t3=new ThreadTest(30,"VACCINATED21");
        
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start(); 
            t3.join();    
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}