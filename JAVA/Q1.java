/* Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all detail
*/

import java.util.Scanner;
abstract class Staff{
    protected int id;
    protected String name;

    protected Staff(int id,String name){
        this.id=id;
        this.name=name;
    }

    abstract void display();
}

class OfficeStaff extends Staff{
    protected String dept;
    public OfficeStaff(int id,String name,String dept){
        super(id,name);
        this.dept=dept;
    }

    public void display(){
        System.out.println("id: "+id+" Name:"+name+"Department:"+dept);
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of objects:");
        int n=sc.nextInt();
        Staff st[]=new OfficeStaff[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter id:");
            int id=sc.nextInt();
            System.out.print("Enter name:");
            String name=sc.next();
            System.out.print("Enter the department:");
            String dept=sc.next();
            st[i]=new OfficeStaff(id,name,dept);
        }
        
        for(int i=0;i<n;i++)
        {
            st[i].display();
        }
    }
}