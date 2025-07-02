import java.util.*;

class Employee{
    private int id;
    private String name;
   private String Department;
    private double salary;
    private static int object_count=0;

    public Employee(){
        this.id=0;
        this.name="NULL";
        this.Department="NULL";
        this.salary=0.0;
        object_count++;
    }
    
    public Employee(int id,String name,String Department,double salary)
    {
        this.id=id;
        this.name=name;
        this.Department=Department;
        this.salary=salary;
        object_count++;

        System.out.println("The object count is :"+getObjectCount());
    }

    
    public static int getObjectCount() {
        return object_count;
    }

    public void displayInfo() {
        System.out.println(this.id+"\t"+this.name+"\t"+this.Department+"\t"+this.salary);
      
    }

}

 class MainEmployee {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of employees:");
    int n=sc.nextInt();
    Employee[] emp=new Employee[n];
    for(int i=0;i<emp.length;i++)
    {
        System.out.println("Enter details of Employee" +(i+1)+":");
        System.out.print("Enter id:");
        int id=sc.nextInt();
        System.out.print("Enter Name:");
        String name=sc.next();
        System.out.print("Enter department:");
        String dept=sc.next();
        System.out.print("Enter salary:");
        double sal=sc.nextDouble();
        emp[i]=new Employee(id,name,dept,sal);
       // System.out.println("The object count after creating employees : "+Employee.getObjectCount());
    }
    System.out.println("Total number of object created :"+Employee.getObjectCount());
    System.out.println("ID\tName\tDepartment\tSalary");
    for(int i=0;i<emp.length;i++)
    {
        emp[i].displayInfo();
    }
  }
}