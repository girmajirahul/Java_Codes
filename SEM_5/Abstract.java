/*
    Program to define an abstract class Staff with members name and address. 
    Define two sub-classes of this class – FullTimeStaff (department, salary) and 
    PartTimeStaff (number-of-hours, rate-perhour). Define appropriate constructors. Create 
    n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user’s 
    choice. Display details of all FullTimeStaff objects and all PartTimeStaff objects. 
*/

import java.util.Scanner;

abstract class Staff
{
    String name;
    String address;   
}

class FullTimeStaff extends Staff
{
    String department;
    double salary;

   FullTimeStaff()
    {
        super.name=name;
        super.address=address;
        this.department=department;
        this.salary=salary;
    }
    void accept()
    {
         Scanner sc=new Scanner(System.in);
            System.out.print("Enter name :");
            name=sc.next();
            System.out.print("Enter address:");
            address=sc.next();
            System.out.print("Enter the department:");
            department=sc.next();
            System.out.print("Enter the salary:");
            salary=sc.nextDouble();
    }

    void display()
    {
        System.out.println(super.name+"\t"+super.address+"\t"+this.department+"\t"+this.salary);
    }
}

class PartTimeStaff extends Staff{
    int number_of_hours;
    int rate_per_hour;

    PartTimeStaff()
    {
        super.name=name;
        super.address=address;
        this.number_of_hours=0;
        this.rate_per_hour=0;
    }

    void accept()
    {
          Scanner scc=new Scanner(System.in);
            System.out.print("Enter name :");
            name=scc.next();
            System.out.print("Enter address:");
            address=scc.next();
            System.out.print("Enter the hour:");
            this.number_of_hours=scc.nextInt();
            System.out.print("Enter the Rate:");
            this.rate_per_hour=scc.nextInt();
    }

     void display()
    {
        System.out.println(super.name+"\t"+super.address+"\t"+this.number_of_hours+"\t"+this.rate_per_hour);
    }
}


class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
       System.out.println("Select your your choice\n 1.Full Time Staff\n 2.Part Time Staff");
        System.out.println("Enter your choice:");
        int ch=in.nextInt();

        switch(ch)
        {
            case 1:
            System.out.print("Enter number of NUmber of full time staff:");
            int n=in.nextInt();
            FullTimeStaff[] staff = new FullTimeStaff[n];
            for(int i=0;i<n;i++)
            {
                staff[i]=new FullTimeStaff();
                staff[i].accept();
            }

            System.out.println("Name\tAddress\tDepartment\tSalary");
            for(int i=0;i<n;i++)
            {
                staff[i].display();
            }

            break;

            case 2:
                System.out.print("Enter number of Part time staff:");
                 n=in.nextInt();
                PartTimeStaff[] pstaff=new PartTimeStaff[n];
                for(int i=0;i<n;i++)
                {
                    pstaff[i]=new PartTimeStaff();
                    pstaff[i].accept();
                }
                System.out.println("Name\tAddress\tHours\tRate");
                for(int i=0;i<n;i++)
                {
                    pstaff[i].display();
                }
                break;
        }
    }
}