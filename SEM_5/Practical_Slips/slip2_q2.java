/* Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). 
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order*/
// bat_avg=(total_runs/(innings-nout))


import java.util.Scanner;

class CricketPlayer{
    protected String name;
    protected int no_of_innings;
    protected int times_not_out;
    protected int totalruns;
    protected double bat_avg;

    public CricketPlayer(String name,int no_of_innings,int times_not_out,int totalruns,double bat_avg)
    {
        this.name=name;
        this.no_of_innings=no_of_innings;
        this.times_not_out=times_not_out;
        this.totalruns=totalruns;
        this.bat_avg=bat_avg;

    }

    public static double bat_avg(int totalruns,int no_of_innings,int times_not_out)
    {
        double avg=(totalruns/(no_of_innings-times_not_out));
        return avg;
    }

    public static void sort(CricketPlayer[] p,int n)
    {
        CricketPlayer temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(p[j].bat_avg >p[j+1].bat_avg)
                {
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
    }
    public void display()
    {
        System.out.println(name+"\t"+no_of_innings+"\t"+times_not_out+"\t"+totalruns+"\t"+bat_avg+"\t");
    }
}

class TestPlayer{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of players:");
        int n=sc.nextInt();

        CricketPlayer[] p=new CricketPlayer[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter deatils of "+(i+1)+" Player");
            System.out.print("Enter name:");
            String name=sc.next();
            System.out.print("Enter no of innings:");
            int innings=sc.nextInt();
            System.out.print("Enter no of times not out:");
            int notout=sc.nextInt();
            System.out.print("Enter total runs:");
            int runs=sc.nextInt();
           
            double avg=CricketPlayer.bat_avg(runs,innings,notout);

            p[i]=new CricketPlayer(name,innings,notout,runs,avg);
        }

       
        System.out.println("Before Sorting");
        System.out.println("Name\tInnings\tnout\truns\tbat avg");
        for(int i=0;i<n;i++)
        {
            p[i].display();
        }

        CricketPlayer.sort(p,n);
        System.out.println("After Sorting  ");
        System.out.println("Name\tInnings\tnout\truns\tbat avg");
        for(int i=0;i<n;i++)
        {
            p[i].display();
        }
    }
}