import mypackage.*;
import java.util.*;
public class Student {
    public int roll_no;
    public String name;
    public SYmarks symarks;
    public TYmarks tymarks;

    public  Student(int rollno,String name,SYmarks symarks,TYmarks tymarks)
    {
        this.roll_no=rollno;
        this.name=name;
        this.symarks=symarks;
        this.tymarks=tymarks;
 
    }

    public double calculateTotalMarks(){
        double marks_total= symarks.ComputerTotal+symarks.MathsTotal+symarks.ElectronicsTotal+
                tymarks.theory+tymarks.practicals;
        return marks_total;
       
    }

    public  char calculateGrade(){
        double total=calculateTotalMarks();
        if(total>=70)
            return 'A';
        else if (total>=60)
            return 'B';
        else if(total>=50)
            return 'C';
        else if(total>=40)
            return 'D';
        else
            return 'F';
    }

    public void display(){
        char grade = calculateGrade();
        double total=calculateTotalMarks();
        System.out.println(roll_no+"\t"+name+"\t"+total+"\t" + grade+"\t");
        /*System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Grade: " + grade);
        */
    }
}

class MainStudent {
    public static void main(String[] args) {
       // SYmarks syMarks1 = new SYmarks(80, 75, 90);
        //TYmarks tyMarks1 = new TYmarks(85, 90);
        
        /*
        Student student1 = new Student(1, "Rahul", syMarks1, tyMarks1);
        student1.display();
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=input.nextInt();

        SYmarks[] sy=new SYmarks[n];
        TYmarks[] ty=new TYmarks[n];
        Student[] stud=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for Student ");
            System.out.print("Enter roll number:");
            int roll=input.nextInt();        
            System.out.print("Enter the name:");
            String name=input.next();
            
            System.out.println("Enter SY marks of "+(i+1)+" Student");
            System.out.print("Enter marks for computer Science:");
            int cs=input.nextInt();
            System.out.print("Enter marks for Maths:");
            int maths=input.nextInt();
            System.out.print("Enter marks for Electronics:");
            int ele=input.nextInt();

            sy[i]=new SYmarks(cs,maths,ele);

            System.out.println("Enter TY marks of "+(i+1)+" Student");
           
            System.out.print("Enter marks of theory:");
            int theory=input.nextInt();
            System.out.print("Enter marks of practicals:");
            int practicals=input.nextInt();

            ty[i]=new TYmarks(theory,practicals);

            stud[i]=new Student(roll,name,sy[i],ty[i]);
        }

        System.out.println("Rollno\tName\ttotal\tGrade");
        for(int i=0;i<n;i++){
            stud[i].display();
        }
            
        }
}
