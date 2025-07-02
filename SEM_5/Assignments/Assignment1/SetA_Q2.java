import java.util.Scanner;
public class SetA_Q2{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the length:");
    int len=input.nextInt();
    System.out.println("Enter the breadth:");
    int breadth=input.nextInt();
    int area=len*breadth;
    System.out.println("The area of rectangle is :"+area);
    int per=2*(len+breadth);
    System.out.println("The perimeter of rectangle  is :"+per);
    
    } 
}