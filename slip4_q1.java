/*
Q1) Write a program to print an array after changing the rows and columns of a given
 two-dimensional array.
*/ 

import java.util.*;

class Array
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols:");
        int cols=sc.nextInt();
        
        int arr[][]=new int[rows][cols];
        int tranpose[][] =new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter "+(i+1)+" row "+(j+1)+" column:");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Array is ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();    
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               // arr[j][i]=arr[i][j];
                tranpose[j][i]=arr[i][j];
            }
        }

        System.out.println("Tranpose Matrix array is");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(tranpose[i][j]+"\t");
            }
            System.out.println();    
        }
    }
}