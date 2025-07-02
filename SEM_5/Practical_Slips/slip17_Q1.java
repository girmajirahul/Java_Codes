/*Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance) 
 from Customer. Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write 
 necessary member functions to read and display the details of ‘n’customers.
*/

import java.util.Scanner;

class Customer{
    protected String name;
    protected int phoneno;

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name:");
        name=sc.next();
        System.out.print("Enter phone number:");
        phoneno=sc.nextInt();

    }

    public void display()
    {
        System.out.print(name+"\t"+phoneno+"\t");
    }

}

class Depositor extends Customer
{
    protected int accno;
    protected int balance;

    public void accept()
    {
        super.accept();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer accno:");
        accno=sc.nextInt();
        System.out.print("Enter balance:");
        balance=sc.nextInt();

    }

    public void display()
    {
        super.display();
        System.out.print(accno+"\t"+balance+"\t");
    }
}

class Borrower extends Depositor
{
    protected int loan_amt;
    protected int loan_no;

    public void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter laon no:");
        loan_no=sc.nextInt();
        System.out.print("Enter Loan amount:");
        loan_amt=sc.nextInt();

    }

    public void display()
    {
        super.display();
        System.out.print(loan_no+"\t"+loan_amt+"\t");

    }
}

class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of customer:");
        int n=input.nextInt();

        Borrower[] c=new Borrower[n];

        for(int i=0;i<n;i++)
        {
            c[i]=new Borrower();
            c[i].accept();
        }

        for(int i=0;i<n;i++)
        {
            c[i].display();
        }
    }
}