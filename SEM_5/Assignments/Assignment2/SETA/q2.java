import java.util.*;
class student{
    private int roll_no;
    private String name;
    private Double percentage;

  public student(int roll_no,String name,Double percentage){
    this.roll_no=roll_no;
    this.name=name;
    this.percentage=percentage;
  }
  public static void sortStudents(student[] stud) {
       // Arrays.sort(stud, (s1, s2) -> Double.compare(s2.percentage,s1.percentage));

      student t;
      for(int i=1;i<stud.length;i++)
      {
        for(int j=0;j<(stud.length-i);j++)
        {
          if(stud[j].percentage > stud[j+1].percentage)
          {
            t=stud[j];
            stud[j]=stud[j+1];
            stud[j+1]=t;
          }
        }
      }
    
    }

   public void display(){
    System.out.print(this.roll_no+"\t"+this.name+"\t"+this.percentage);
   
  }

}

class MainStudent {
  public static void main(String[] args){
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of students:");
    int n=sc.nextInt();
    student stud[]=new student[n];
    for(int i=0;i<stud.length;i++){
        System.out.println("Enter details for Student " + (i + 1) + ":");
        System.out.print("Roll no:");
        int roll_no=sc.nextInt();
        System.out.print("Name:");
        String name=sc.next();
        System.out.print("Percentage:");
        Double per=sc.nextDouble();
        stud[i]=new student(roll_no,name,per);
    }
    System.out.println("Students details before sorting:");
    System.out.println("ROLL NO\tNAME\tPERCENTAGE");
    for(int i=0;i<stud.length;i++){
        stud[i].display();
        System.out.println();
    }
    
    student.sortStudents(stud);

    System.out.println("Students details after sorting:");
    System.out.println("ROLL NO\tNAME\tPERCENTAGE");
    for(int i=0;i<stud.length;i++){
        stud[i].display();
        System.out.println();
    }
  
  }
}