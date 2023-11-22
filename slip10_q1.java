/*
Write a program to find the cube of given number using functional interface.

*/

import java.util.Scanner;

interface Printcube
{
  public void display(int num);
}

class cube
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        
        Printcube obj =(n)->{
            System.out.println("The cube of number is "+n*n*n);
        };
        obj.display(num);
     }
}
