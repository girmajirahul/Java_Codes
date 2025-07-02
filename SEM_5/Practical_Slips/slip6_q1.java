/*
Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().
*/
import java.util.Scanner;

class Employee
{
    public int Empid;
    public String Empname;
    public  String Empdesignation;
    public double Empsal;
   public  void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the id:");
        this.Empid=sc.nextInt();
        System.out.print("Enter the name:");
        this.Empname=sc.next();
        System.out.print("Enter the designation:");
        this.Empdesignation=sc.next();
        System.out.print("Enter the salary:");
        this.Empsal=sc.nextDouble();
    }

    public String toString()
    {
        return "Employee details are \n"+Empid+"\n"+Empname+"\n"+Empdesignation+"\n"+Empsal ;
       
    }

    public static void main(String[] args)
    {
        Employee emp=new Employee();
        emp.accept();

      String display=  emp.toString();
        System.out.println(display+" ");
    }
}