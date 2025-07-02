import java.util.Scanner;

class collage
{
    protected int cno;
    public String cname;
    public String caddr;

    public void accept()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the collage id:");
        this.cno=input.nextInt();
        System.out.print("Enter the collage name:");
        this.cname=input.next();
        System.out.print("Enter collage Address:");
        this.caddr=input.next();
    }

    public void display()
    {
        System.out.println(cno+"\t"+cname+"\t"+caddr);
    }


}

class department extends collage
{
    protected int dno;
    public String dname;

    public void accept_dept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the department no:");
        this.dno=sc.nextInt();
        System.out.print("Enter department name:");
        this.dname=sc.next();
    }

    public void display_dept()
    {
        System.out.println(dno+"\t"+dname+"\t");
    }
}

class Main
{
    public static void main(String[] args){

    department dept=new department();
    dept.accept();
    dept.display();
    dept.accept_dept();
    dept.display_dept();
    }
}