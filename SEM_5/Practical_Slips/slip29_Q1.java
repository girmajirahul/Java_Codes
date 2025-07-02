/*
Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
 Write a method to search the customer name with given contact number and display the 
 details. 
*/

import java.util.Scanner;

class Customer{
    protected int custno;
    protected String custname;
    protected long contactnumber;
    protected String address;

    public Customer(int custno,String custname,long contactnumber,String address)
    {
        this.custno=custno;
        this.custname=custname;
        this.contactnumber=contactnumber;
        this.address=address;
    }

    static public void search(Customer[] cust,long number)
    {
        for(Customer customer:cust)
        {
            if(customer.contactnumber==number)
            {
                System.out.println("Customer no"+customer.custno);
                System.out.println("Customer name"+customer.custname);
                System.out.println("Customer address"+customer.address);
                System.out.println("Customer contact number"+customer.contactnumber);
                return;
            }
        }
        System.out.print("Customer not found!");
    }

    public static void main(String[] args)
    {   
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of customer:");
            int n=sc.nextInt();
            Customer[] cust=new Customer[n];
    
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter cutomer number:");
                int no=sc.nextInt();
                System.out.print("Enter name:");
                String name=sc.next();
                System.out.print("Enter contact number:");
                long num=sc.nextLong();
                System.out.print("Enter address:");
                String addr=sc.next();

                cust[i]=new Customer(no,name,num,addr);
            }


            System.out.println("Enter number to search:");
            long snum=sc.nextLong();

            search(cust,snum);



    }
}