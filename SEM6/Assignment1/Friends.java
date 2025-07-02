import java.util.*;
public class Friends{

    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of friends:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter your friend name:");
            String name=sc.next();
            ll.add(name);
        }

        System.out.print(ll);
    }
}