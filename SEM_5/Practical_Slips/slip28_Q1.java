/*
    Write a program that reads on file name from the user, then displays information about 
 whether the file exists, whether the file is readable, whether the file is writable, the type of 
 file and the length of the file in bytes.

 */

import java.io.*;

class slip28_Q1{
    public static void main(String[] args)
    {
        String path=args[0];

        File fp=new File(path);

        if(fp.exists())
        {
            System.out.println("File is exists");

            if(fp.canRead())
            {
                System.out.println("File is Readable");
            }
            else{
                System.out.println("File is not readable");
            }

            if(fp.canWrite()){
                System.out.println("File is writable");
            }
            else{
                System.out.println("File is not writable");
            }

            System.out.print("Type of file "+fp.getName());
            System.out.print("Size of file "+fp.length());
        }
        else{
            System.out.println("File does not exists");
        }

    }
}