import java.util.Scanner;

class Array2d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the cols:");
        int cols=sc.nextInt();
        
        int[][] arr=new int[rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter "+(i+1)+" row "+(j+1)+" column  array element:");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array Elemnets Are:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
       int res=0;
        for(int i=0;i<rows;i++)
        {
           
            for(int j=0;j<cols;j++)
            {
               if(i==j)
                    res=res+arr[i][j];
            }
        }
        System.out.println("The sum of diagonal elements are:"+res);
    }
}