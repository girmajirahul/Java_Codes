import java.util.*;

class CricketPlayer{

    public String player_name;
    public int no_of_innings;
    public int no_of_time_not_out;
    public int total_runs;
    public double bat_avg;

    CricketPlayer(String name,int innings,int not_out,int runs,double bat_avg)
    {
        this.player_name=name;
        this.no_of_innings=innings;
        this.no_of_time_not_out=not_out;
        this.total_runs=runs;
        this.bat_avg=bat_avg;

    }

    public void display(){
        System.out.println(player_name+"\t"+no_of_innings+"\t"+no_of_time_not_out+"\t"+total_runs+"\t"+bat_avg);
    }

}

class MainPlayer{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of player:");
        int n=input.nextInt();

        CricketPlayer[] player=new CricketPlayer[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter details of Players");
            System.out.print("Enter name:");
            String name=input.next();
            System.out.print("Enter number of innings:");
            int innings=input.nextInt();
            System.out.print("Enter total number of time not out:");
            int not_out=input.nextInt();
            System.out.print("Enter total runs:");
            int truns=input.nextInt();
            System.out.print("Enter bat average:");
            double bat_avg=input.nextDouble();

            player[i]=new CricketPlayer(name,innings,not_out,truns,bat_avg);
        }

        System.out.println("Name\tinnings\tnot out\ttotal runs\tbatting average");
        for(int i=0;i<n;i++)
        {
            player[i].display();
        }

         
        Arrays.sort(player, (s1, s2) -> Double.compare(s2.bat_avg,s1.bat_avg));

        System.out.println("After sorted");
        System.out.println("Name\tinnings\tnot out\ttotal runs\tbatting average");
        for(int i=0;i<n;i++)
        {
            player[i].display();
        }

    }
}