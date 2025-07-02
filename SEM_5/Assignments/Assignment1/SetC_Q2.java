import java.util.Scanner;

class Array2DOperation{

    public static void sum_of_diagonal(int a[][],int rows,int cols){
        int i,j;
        int sum=0;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(i==j){
                    sum=sum+a[i][j];
                }
            }
        }
       System.out.println("The sum of diagonal Elements of matrix is:"+sum);
    }

    public static void lower_diagonal(int a[][],int rows,int cols){
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j<i && a[i][j]!=0){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The sum of lower diagonal elements is:"+sum);
    }

    public static void upper_diagonal(int a[][],int rows,int cols){
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j>i && a[i][j]!=0){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The sum of upper diagonal elements is:"+sum);
    }

    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols:");
        int cols=sc.nextInt();
        
        int a[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter "+(i+1)+" row "+(j+1)+" column:");
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]+" \t"); 
            }
            System.out.println();
        }

        /*sum_of_diagonal(a,rows,cols);
        lower_diagonal(a,rows,cols);
        upper_diagonal(a,rows,cols);
        */

       while(true){
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:sum_of_diagonal(a,rows,cols);
            break;
            case 2: upper_diagonal(a,rows,cols);
            break;
            case 3: lower_diagonal(a,rows,cols);
            break;
            case 4:System.exit(0);
            break;
            default:
                System.out.println("Enter right choice !");
        }
       }
    }
}