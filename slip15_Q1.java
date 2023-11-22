import java.io.*;
import java.util.Scanner;

class filecopy
{
    public static void main(String[] args)throws IOException
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter source file :");
        String src=input.next();
        System.out.print("Enter the Destination file:");
        String dest=input.next();
        FileReader fread=new FileReader(src);
        FileWriter fwrite=new FileWriter(dest);

        int c;
        while((c=fread.read())!=-1)
        {
            fwrite.write(c);

        }
        System.out.print("Copied Successfully !");
        fread.close();
        fwrite.close();


    }
}