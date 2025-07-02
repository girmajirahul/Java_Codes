/*

Write a program to define a class Account having members custname, accno. Define default 
 and parameterized constructor. Create a subclass called SavingAccount with member savingbal, 
 minbal. Create a derived class AccountDetail that extends the class SavingAccount with 
 members, depositamt and withdrawalamt. Write a appropriate method to display customer 
 details



 */

import java.util.Scanner;

class Account
{
    protected String custname;
    protected int accno;

    public Account()
    {

    }

    public Account(String custname,int accno)
    {
        this.custname=custname;
        this.accno=accno;

    }

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name:");
        custname=sc.next();
        System.out.print("Enter account number:");
        accno=sc.nextInt();
    }

    public void display()
    {
        System.out.print(custname+"\t"+accno+"\t");
    }


}

class SavingAccount extends Account
{
    protected int savingbal;
    protected int minbal;

    public void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter saving balance:");
        savingbal=sc.nextInt();
        System.out.print("Ente minimal balance:");
        minbal=sc.nextInt();

    }

    public void display()
    {
        super.display();
        System.out.print(savingbal+"\t"+minbal+"\t");
    }

}

class AccountDetail extends SavingAccount
{
    protected int depositamt;
    protected int withdrawalamt;

    public void accept(){
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter deposit amount:");
        depositamt=sc.nextInt();
        System.out.print("Enter withdrawal amount:");
        withdrawalamt=sc.nextInt();
    }

    public void display()
    {
        super.display();
        System.out.print(depositamt+"\t"+withdrawalamt+"\t");
    }

}

class Main{
    public static void main(String[] args)
    {
        Account ac=new AccountDetail();
        ac.accept();
        System.out.println("Name\tAccount no\tbalance\tmin bal\tdeposit\tWithdraw");
        ac.display();
    }
}