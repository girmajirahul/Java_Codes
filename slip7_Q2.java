import java.io.*;
import java.util.*;

class readfile
{
    public static void main(String[] args) throws IOException
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter file name:");
        String fname=input.next();
        FileReader file=new FileReader(fname);

        Scanner sc=new Scanner(file);
        String s;
        while(sc.hasNext())
        {
            StringBuffer sb=new StringBuffer();
            s=sc.next();
            String s1=s.toUpperCase();
            sb.append(s1);
            sb.reverse();
            System.out.println(s1);
            System.out.println(sb);
        }

    }
}