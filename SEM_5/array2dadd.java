import java.util.Scanner;

public class array2dadd{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows and colums:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        int c[][]=new int[rows][cols];

        System.out.print("Enter the value of matrix 'a' ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();    
        }
        
        System.out.println(" the matrix 'a' ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();    
        }

        System.out.print("Enter the value of matrix 'b' ");
        for( int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
            System.out.println();    
        }
          System.out.println(" the matrix 'b' ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();    
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix Addition is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}