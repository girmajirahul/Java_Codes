import mypackage.*;
import java.util.Scanner;

class Students
{
    protected int rollno;
    protected String name;
    protected SYMarks symarks;
    protected TYMarks tymarks;

    public Students(int rollno,String name,SYMarks symarks,TYMarks tymarks)
    {
        this.rollno=rollno;
        this.name=name;
        this.symarks=symarks;
        this.tymarks=tymarks;
    }

    public double cal_total_marks()
    {
        double markstotal=symarks.computertotal+symarks.Mathstotal+symarks.Electronicsstotal+tymarks.theory+tymarks.practical;
        return markstotal;
    }

    public char Grade()
    {
        double total=cal_total_marks();
        if(total >=70)
            return 'A';
        else if(total >=60)
            return 'B';
        else if(total >=50)
            return 'C';
        else
            return 'F';

    }

    public void display()
    {
        double total=cal_total_marks();
        char grade=Grade();
        System.out.println(rollno+"\t"+name+"\t"+total+"\t"+grade+"\t");

    }

}

class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=sc.nextInt();

        SYMarks[] sy=new SYMarks[n];
        TYMarks[] ty=new TYMarks[n];
        Students[] stud=new Students[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details of "+(i+1)+" Student ");
            System.out.print("Enter roll no of Student:");
            int no=sc.nextInt();
            System.out.print("Enter name of Student:");
            String name=sc.next();

            System.out.print("Enter marks of computer:");
            int cs=sc.nextInt();
            System.out.print("Enter marks of maths:");
            int maths=sc.nextInt();
            System.out.print("Enter marks of electronics:");
            int ele=sc.nextInt();

            sy[i]=new SYMarks(cs,maths,ele);

            System.out.print("Enter marks of theory:");
            int theory=sc.nextInt();
            System.out.print("Enter marks of practical :");
            int practical=sc.nextInt();

            ty[i]=new TYMarks(theory,practical);

            stud[i]=new Students(no,name,sy[i],ty[i]);

        }

        System.out.println();

        System.out.println("ID\tNAME\tTOTAL\tGRADE");
        for(int i=0;i<n;i++)
        {
            stud[i].display();
        }
    }
}