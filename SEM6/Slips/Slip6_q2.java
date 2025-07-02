import java.io.*;

class TrafficSignal{
    private String CurrentSignal="RED";

    public synchronized void ChangeSignal(){
        if(CurrentSignal.equals("RED")){
            System.out.println("Changing signal from RED to GREEN");
            CurrentSignal="GREEN";
        }
        else if(CurrentSignal.equals("GREEN")){
            System.out.println("Changing signal from GREEN to YELLOW");
            CurrentSignal="YELLOW";
        }
        else if(CurrentSignal.equals("YELLOW")){
            System.out.println("Changing signal from YELLOW to RED");
            CurrentSignal="RED";
        }
        notifyAll();
    }

    public synchronized String getCurrentSignal(){
        return CurrentSignal;
    }
}

class  ChangeTrafficSignal extends Thread{
    private TrafficSignal trafficSignal;

    public ChangeTrafficSignal(TrafficSignal trafficSignal){
        this.trafficSignal=trafficSignal;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
                trafficSignal.ChangeSignal();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

class CarThread extends Thread{
    private TrafficSignal trafficSignal;

    public CarThread(TrafficSignal trafficSignal){
        this.trafficSignal=trafficSignal;
    }

    public void run(){
        while(true){
            try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" approaching traffic signal ,current siganl "+trafficSignal.getCurrentSignal());
            if(trafficSignal.getCurrentSignal().equals("RED")){
                System.out.println(Thread.currentThread().getName()+"stopped at RED signal");
                synchronized(trafficSignal){
                    trafficSignal.wait();
                }
            }
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class TrafficControl{
    public static void main(String[] args){
        TrafficSignal trafficSignal=new TrafficSignal();
        ChangeTrafficSignal change=new ChangeTrafficSignal(trafficSignal);
        change.setDaemon(true);
        change.start();
        CarThread c1=new CarThread(trafficSignal);
        CarThread c2=new CarThread(trafficSignal);
        CarThread c3=new CarThread(trafficSignal);
        c1.setName("Car1");
        c2.setName("Car2");
        c3.setName("Car3");

        c1.start();
        c2.start();
        c3.start();
        try{
            Thread.sleep(Long.MAX_VALUE);
        }
        catch(InterruptedException e){
            System.out.print(e);
        }
    }
}