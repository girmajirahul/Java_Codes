/*
 Design a class for Bank. Bank Class should support following operations; 
 a. Deposit a certain amount into an account
 b. Withdraw a certain amount from an account
 c. Return a Balance value specifying the amount with details

*/
import java.util.*;

class Bank
{
    protected double Deposit;
    protected double Withdraw;

    public void accept_entery()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the deposit amount:");
        this.Deposit=sc.nextDouble();
        System.out.print("Enter the withdraw amount:");
        this.Withdraw=sc.nextDouble();
    }

    public void display()
    {
        System.out.println(Deposit+"\t"+Withdraw+"\t");
    }
    

    public double Balance()
    {
        return Deposit - Withdraw;
    }

    public static void main(String[] args)
    {
        Bank b= new Bank();
        b.accept_entery();
        double balance=b.Balance();
        
        System.out.println("DEPOSIT\t WithDraw");
        b.display();
        System.out.println("Balance Amount is \t"+balance+"\t");
    }
}

