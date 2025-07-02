import java.io.*;
import java.util.*;

class HashTableTest2{
    public static void main(String[] args){
        Hashtable hs=new Hashtable();
        // Enumeration names;
         Enumeration names;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of records:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the Student name:");
            String name=sc.next();
            System.out.print("Enter the mobile number:");
            Long mno=sc.nextLong();

            hs.put(name,mno);
        }
        names=hs.keys();
        while(names.hasMoreElements()){
            str=(String)names.nextElement();
            System.out.println(str+" "+hs.get(str));
        }
    }
}