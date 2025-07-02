import java.util.*;

class setbq1{

    public static void main(String[] args)
    {
        TreeSet ts =new TreeSet();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of integers:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter integers:");
            int number=sc.nextInt();
            ts.add(number);
        }

        System.out.print(ts);
    }
}