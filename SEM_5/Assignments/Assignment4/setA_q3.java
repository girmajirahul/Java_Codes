import java.util.Scanner;
import java.io.*;

public class setA_q3 {
  public static void main(String[] args) throws Exception{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter source file name:");
    String f1=sc.next();
    System.out.println("Enter destination file name:");
    String f2=sc.next();

    FileReader fr=new FileReader(f1);
    FileWriter fw=new FileWriter(f2);
    int c;
    while((c=fr.read())!=-1)
    {
       // c=sc.next();
        fw.write(c);
    }
    System.out.print("Copied Succesfully!");

    fr.close();
    fw.close();

  }
}