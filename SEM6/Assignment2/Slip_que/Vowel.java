//program vowel from a string after every 3 seconds

import java.util.Scanner;

public class Vowel 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();

        for(int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("Vowel found: "+ch);
                try
                {
                    Thread.sleep(3000);
                }
                catch(InterruptedException e)
                {}
            }
        }

        sc.close();
    }
}
