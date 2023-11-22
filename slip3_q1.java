import java.util.Scanner;

class Cities
{
  private String name;
  private int srno;

   public void accept()
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter srno:");
        this.srno=sc.nextInt();
        System.out.print("Enter city name:");
        this.name=sc.next();
   }

    public void display()
    {
        System.out.println(this.srno+"\t"+this.name+"\t");
    }

    public static  void sort(Cities[] city)
    {
        Cities temp;
        for(int i=1;i<city.length;i++)
        {
            for(int j=0;j<(city.length-i);j++)
            {
                if(city[j].srno > city[j+1].srno)
                {
                    temp=city[j];;
                    city[j]=city[j+1];
                    city[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter number of cities");
        int n=input.nextInt();
        Cities[] c=new Cities[n];
       
     
        for(int i=0;i<n;i++)
        {
          c[i]=new Cities();
          c[i].accept();
          
        }

        System.out.println("Cities before sorted");
        for(int i=0;i<n;i++)
        {
            c[i].display();
        }
        sort(c);

        System.out.println("Cities in sorted array is");
        for(int i=0;i<n;i++)
        {
            c[i].display();
        }


    }

}