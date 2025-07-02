import java.io.*;

class demo{
    public static void main(String s[])throws IOException{
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(i);
        System.out.print("Enter name");
        String n=br.readLine();
        System.out.print("name="+n);
    }
}