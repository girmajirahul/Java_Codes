import java.util.Scanner;

public class slip5_q2 {
    

  public static void main(String[] args){
  
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows:");
    int rows=sc.nextInt();
    System.out.print("Enter number of cols:");
    int cols=sc.nextInt();

    int[][] a=new int[rows][cols];
    int[][] b=new int[rows][cols];
    int[][] c=new int[rows][cols];
    System.out.println("first matrix :");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print("Enter "+(i+1)+" row "+(j+1)+" column element:");
            a[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("Second  matrix :");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print("Enter "+(i+1)+" row "+(j+1)+" column element:");
            b[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print(b[i][j]+"\t");
        }
        System.out.println();
    }
    while(true)
    {
        System.out.println("1.Addition\n2.Multiplication\n3.Exit");
        System.out.print("Enter your choice :");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
               
                for(int i=0;i<rows;i++)
                    for(int j=0;j<cols;j++)
                        c[i][j]=a[i][j]+b[i][j];
                System.out.println("Addition of two matrices:");
                for(int i=0;i<rows;i++)
                {
                    for(int j=0;j<cols;j++)
                    {
                        System.out.print(c[i][j]+"\t");
                    }
                    System.out.println();
                }
                break;
                case 2:
                    for(int i=0;i<rows;i++)
                        for(int j=0;j<cols;j++)
                            c[i][j]=a[i][j]*b[j][i];
                    for(int i=0;i<rows;i++){
                        for(int j=0;j<cols;j++)
                        {
                            System.out.print(c[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;

        }


    }
    
  }
}