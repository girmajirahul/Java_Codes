import java.io.*;

class Buffer{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.print("Enter rollno :");
        int rollno=Integer.parseInt(br.readLine());
        System.out.print("Enter Student name:");
        String name=br.readLine();
        System.out.print("Enter class:");
        String cl=br.readLine();
        System.out.print("Enter percentage:");
        int per=Integer.parseInt(br.readLine());
        System.out.print(rollno+"\t"+name+"\t"+cl+"\t"+per+"\t");

    }
}