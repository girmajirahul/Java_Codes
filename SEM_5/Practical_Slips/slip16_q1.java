import java.util.Scanner;

interface printSquare
{
    public void display(int num);
}

class Square{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  the number : ");
        int num=sc.nextInt();

        printSquare obj=(n)->{
            System.out.println("The square of number is"+n * n);
        };
        obj.display(num);
    }
}