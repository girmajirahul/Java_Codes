/**
 Write a java program to create a TreeSet, add some colors 
 (String) and print out the content of TreeSet in ascending order
 */

import java.io.*;
import java.util.*;
class Colors{
    public static void main(String[] args){
        TreeSet<String> color= new TreeSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of colors:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the colors:");
            String col=sc.next();
            color.add(col);
        
    }
        Iterator<String> li=color.iterator();
        System.out.println("Colors in ascending order:");
        while(li.hasNext()){
            System.out.print(li.next() +" ");
        }
        
    }
}