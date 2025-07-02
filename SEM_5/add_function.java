import java.util.Scanner;
import java.io.*;


 class demo{
     int add(int a,int b){
        return a+b;
    }
}

public class add_function{
    public static void main(String s[]){
        demo obj=new demo();
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        a=input.nextInt();
        System.out.print("Enter the number:");
        b=input.nextInt();
        System.out.print("Addition of "+a+" and "+b+" is :"+obj.add(a,b));
    }
}
