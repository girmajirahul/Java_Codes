import java.util.Scanner;

public class calculation{
    public static void main(String[] args){
        int a;
        int b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=input.nextInt();
        System.out.println("Enter the value of b:");
        b=input.nextInt();
        System.out.println("Sum of two numbers="+(a+b));
        System.out.println("Substraction of two numbers is:"+(a-b));
        System.out.println("Multiplication of two numbers:"+(a*b));

    }
}