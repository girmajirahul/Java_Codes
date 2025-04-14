/** 
 Write a Java program to accept ‘n’ integers from the user and store them in a 
 collection. Display them in the sorted order. The collection should not accept 
 duplicate elements. (Use a suitable collection). Search for a 
 particular element using predefined search method in the Collection framework.
 */
import java.util.*;
import java.io.*;

class SortedCollection{
    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter elements :");
            int element=sc.nextInt();
            ts.add(element);
        }

        System.out.println(ts);
        System.out.print("Enter number to search:");
        int snum=sc.nextInt();
        if(ts.contains(snum)){
            System.out.println(snum+" is found in the collection");
        }
        else{
            System.out.println(snum+" is not found in the Collection");
        }

    }
}