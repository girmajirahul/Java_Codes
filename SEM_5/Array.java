import java.util.Scanner;

public class Array{
    public static void main(String s[]){
        int n ;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter value:");
            a[i]=sc.nextInt();
        } 
        System.out.println("Array elemnets are:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}