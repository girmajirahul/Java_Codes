import java.util.*;
import java.io.*;
public class hashtable {
  public static void main(String[] args){
    
    Hashtable student=new Hashtable();
    Enumeration names;
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of students:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print("Enter student name:");
      String name=sc.next();
      System.out.print("Enter student contact number:");
      Long mob=sc.nextLong();

      student.put(name,mob);
    }
    
    names=student.keys();
    while(names.hasMoreElements())
    {
        str=(String)names.nextElement();
        System.out.println(str+"  "+student.get(str));
    }

  }
}