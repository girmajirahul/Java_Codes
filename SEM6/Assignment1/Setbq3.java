import java.util.*;
import java.io.*;

class Setbq3{
    public static void main(String[] args) throws IOException {
        Hashtable hashtable=new Hashtable();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter file name:");
        String fname=input.next();

        FileReader fr=new FileReader(fname);
        Scanner sc=new Scanner(fr);
        String s;
        while(sc.hasNext())
        {
            s=sc.nextLine();
            String[] str=s.split(" ");
           // System.out.println(str[0]+" "+str[1]);
            hashtable.put(str[0],str[1]);
        }
        
        System.out.println("Contents of hashtable.");
        System.out.println("Name\tPhone no");

        Enumeration names=hashtable.keys();
        while(names.hasMoreElements()){
            String sname=(String)names.nextElement();
            System.out.println(sname+" "+hashtable.get(sname));
        }

        System.out.print("Enter name :");
        String name=input.next();
        System.out.println(name+" "+hashtable.get(name));
    }
}