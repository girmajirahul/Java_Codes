/*
Define an Employee class with suitable attributes having getSalary() method, which returns
 salary withdrawn by a particular employee. Write a class Manager which extends a class
 Employee, override the getSalary() method, which will return salary of manager by adding
 traveling allowance, house rent allowance etc. 
 
 */

import java.util.*;

class Employee{
    double salary;
    String name;
    public Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void getSalary()
    {
        System.out.println("Salary is"+salary);
    }
}

class Manager extends Employee{
    double allowance;

    public Manager(String name,double salary,double allowance){
        super(name,salary);
        this.allowance=allowance;
    }

    public void getSalary()
    {
        System.out.println("Salary :"+(salary+allowance));
    }
}

public class slip27_q1{
    public static void main(String[] args)
    {
        Employee emp=new Employee("Rahul",1200.00);
        Employee mng=new Manager("Atharav",1200.00,3000.00);

        emp.getSalary();
        mng.getSalary();
    }
}