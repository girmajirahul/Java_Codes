import java.io.*;
import java.util.*;
class HashSetTest{
    public static void main(String[] args){
        HashSet hs=new HashSet();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of records:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter name :");
            String name=sc.next();
            hs.add(name);
        }

        Iterator i=hs.iterator();
        System.out.println("Name of friends ");
        while(i.hasNext()){
            System.out.println(i.next()+"\t");
        }

        System.out.println("in ascending order:");
        TreeSet ts=new TreeSet(hs);
        Iterator t=ts.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
    }
}