package student;

public class Studentinfo {
  public int rollno;
 
  public String Stud_class;
  public double studper;

  public Studentinfo(int rollno,String Stud_class,double Studper)
  {
        this.rollno=rollno;
    
        this.Stud_class=Stud_class;
        this.studper=studper;
  }

 
  public  void display()
  {
    System.out.println(rollno+"\t"+Stud_class+"\t"+studper+"\t");

  }

}