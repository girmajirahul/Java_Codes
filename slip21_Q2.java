import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private String department;
    private double Salary;
    private static int object_cnt=0;
    public Employee(){
        object_cnt++;

       // System.out.println("Object created is :"+get_object_cnt());
    }

    public Employee(int id,String name,String department,double Salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.Salary=Salary;
        object_cnt++;

        System.out.println("Object created is :"+get_object_cnt());

    }

   

    public static int get_object_cnt()
    {
        return object_cnt;
    }

    public void display()
    {
        System.out.println(id+"\t"+name+"\t"+department+"\t"+Salary+"\t");

    }
}

class MainEmployee
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees:");
        int n=sc.nextInt();
        Employee[] emp=new Employee[n];

        for(int i=0;i<n;i++)
        {
                
            Scanner input=new Scanner(System.in);
            System.out.print("Enter employee id:");
            int id=input.nextInt();
            System.out.print("Enter employee name:");
            String name=input.next();
            System.out.print("Enter department:");
            String department=input.next();
            System.out.print("Enter salary:");
            double Salary=input.nextDouble();

            emp[i]=new Employee(id,name,department,Salary);


        }

        for(int i=0;i<n;i++)
        {
            emp[i].display();
        }
    }
}