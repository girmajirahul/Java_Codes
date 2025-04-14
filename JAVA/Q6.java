/**
 Write a java program to accept ‘n’ integers from the user & store them in an ArrayList collection. Display the 
 elements of ArrayList collection in reverse order. (Using Iterator)
 */

import java.util.*;
import java.io.*;

class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of integers:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter elements:");
            int element=sc.nextInt();
            arr.add(element);
        }

        System.out.println(arr);

        ListIterator<Integer> li=arr.listIterator();
        System.out.print("Array list elements = ");
        while(li.hasNext()){
            System.out.print(" "+li.next());
        }

        System.out.print("\nArray list in reverse order= ");
        while(li.hasPrevious()){
            System.out.print(" "+li.previous());
        }
    }
}