import java.util.Scanner;
class SetB_Q3{
    private static void accept(int [][]a,int rows, int cols){
        int i,j;
        Scanner input=new Scanner(System.in);
       
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++){
                 System.out.print("Enter the matrix elements:");
                a[i][j]=input.nextInt();
            }
        }
    }
    private static void display(int [][] a,int rows,int cols){
        int i,j;
        System.out.println("Array elements are:");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private static void add(int [][] m1,int [][] m2,int [][] a,int rows,int cols){
        int i,j;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                a[i][j]=m1[i][j]+m2[i][j];
            }
        }
    }

    private static void multiplication(int [][]a,int [][]m1,int [][]m2,int rows,int cols){
        int i,j;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                for(int k=0;k<cols;k++){
                a[i][j]+=m1[i][k]*m2[k][j];
            }
            }
        }

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void Transpose(int [][] m1,int rows,int cols){
        int i,j;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(m1[j][i]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int rows,cols,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols:");
        rows=sc.nextInt();
        cols=sc.nextInt();
        
        int [][] m1=new int[rows][cols];
        accept(m1,rows,cols);
        System.out.println("first matrix is:");
        display(m1,rows,cols);
        int [][] m2=new int[rows][cols];
       
        accept(m2,rows,cols);
        System.out.println("Second matrix is");
        display(m2,rows,cols);
       
       int [][] a=new int[rows][cols];
       while(true){
        System.out.println("1.Addition\n 2.Multplication\n 3.Transpose\n 4.Display \n5.Exit");
        System.out.print("Enter the choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                add(m1,m2,a,rows,cols);
            break;
            case 2:multiplication(a,m1,m2,rows,cols);
            break;
            case 3:Transpose(m1,rows,cols);
            break;
            case 4:display(a,rows,cols);
            break;
            case 5:System.exit(0);
            break;
            default:
                System.out.println("Enter right choice!");
        }
       }
    }
}