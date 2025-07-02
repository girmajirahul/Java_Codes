import java.util.Scanner;

public class maxno{
    public static void main(String s[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        System.out.println("The three numbers are:"+a+" " +b+" " +c+" ");

        if((a>b) && (a>c)){
            System.out.println("Maxmimum number is :"+a);
        }
        else if((b>a) && (b>c)){
            System.out.println("maximum number is :"+b);
        }
        else{
            System.out.println("Maximum number is "+c);
        }
    }
} 