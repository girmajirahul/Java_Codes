import java.io.*;
import java.util.*;
class Vowel{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println("Vowel Found:"+ch);
                try{
                    Thread.sleep(3000);
                }
                catch(InterruptedException e)
                {}
            }
        }    
    }
}
