import java.io.*;
import java.util.*;

class CollectionTest
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements to add:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter element to add:");
            int  ele=sc.nextInt();
            ts.add(ele);
        }

        Iterator i=ts.iterator();
        System.out.println("Numbers in sorted order:");
        while(i.hasNext())
        {
            System.out.print("\t"+i.next());
        }
    }
}