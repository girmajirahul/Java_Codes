import java.util.Scanner;
class Array{
    public static void main(String s[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" Array elements:");
            a[i]=input.nextInt();
        }
        System.out.println("Array Elemnets are:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }

        System.out.println("\nArray elemnets in revere order:");
        for(int i=n-1;i>=0;i--){
             System.out.print(a[i]+"\t");
        }
    }
}