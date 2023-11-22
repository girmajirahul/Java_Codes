
import java.util.Scanner;

/* 
Write program to define class Person with data member as Personname,Aadharno, Panno.
 Accept information for 5 objects and display appropriate information (use this keyword)

*/

class Person {
    private String Personname;
    private long Aadharno;
    private String Panno;

   
    public void Accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        this.Personname=sc.next();
        System.out.print("Enter the Adhar no:");
        this.Aadharno=sc.nextLong();
        System.out.print("Enter the Panno:");
        this.Panno=sc.next();
    }

    public void display()
    {
        System.out.println(Personname+"\t"+Aadharno+"\t"+Panno+"\t");
    }

  public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of Person:");
        int n=input.nextInt();
        int i,j;
        Person p[]=new Person[n];
        for(i=0;i<n;i++)
        {
            p[i]=new Person();
            p[i].Accept();
        }

        System.out.println("Name\t AdharNo\t  Panno\t");
        for(i=0;i<n;i++)
        {
            p[i].display();
        }

  }
}