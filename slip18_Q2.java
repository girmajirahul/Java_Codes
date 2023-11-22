import java.util.Scanner;

class CricketPLayer
{
    private String name;
    private int total_runs;
    private int innings;
    private int times_notout;
    private  double bat_avg;

    public CricketPLayer(String name,int innings,int times_notout,int total_runs,double bat_avg)
    {
        this.name=name;
        this.total_runs=total_runs;
        this.innings=innings;
        this.times_notout=times_notout;
        this.bat_avg=bat_avg;

    }

    public static double bat_avg(int times_notout,int innings,int total_runs)
    {
        double avg=(total_runs/(innings-times_notout));
        return avg;
    }

    public void display()
    {
        System.out.println(name+"\t"+innings+"\t"+times_notout+"\t"+total_runs+"\t"+bat_avg+"\t");
    }

}

class MainPlayer
{
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of players:");
        int n=sc.nextInt();

        CricketPLayer[] play=new CricketPLayer[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter player name:");
            String name=sc.next();
            System.out.print("Enter total innings:");
            int innings=sc.nextInt();
            System.out.print("Enter total runs:");
            int runs=sc.nextInt();
            System.out.print("Enter total no of times not:");
            int not_out=sc.nextInt();
            
            double avg=CricketPLayer.bat_avg(not_out,innings,runs);
            play[i]=new CricketPLayer(name,innings,not_out,runs,avg) ; 
        }

        System.out.print("Name\tInnings\tNOtOut\tTotalRuns\tbat average");
        for(int i=0;i<n;i++)
        {
            play[i].display();
        }

    }
}