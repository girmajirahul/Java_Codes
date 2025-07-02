import java.util.Scanner;

public class Array2D{
    public static void main(String s[]){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=a.nextInt();
        System.out.print("Enter the no of cols:");
        int cols=a.nextInt();
        int [][]ar=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the value:");
                ar[i][j]=a.nextInt();
                //ar[i][j]=(i+1)*(j+1);
            }
        }
            System.out.println("The matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(ar[i][j]+"\t");            
            }
            System.out.println("");
        }
    }
}