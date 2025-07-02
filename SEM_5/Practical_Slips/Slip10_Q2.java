import student.Studentinfo;

import java.util.Scanner;

class StudentPer
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enetr Roll no:");
      int rollno=sc.nextInt();
      System.out.print("Enetr class:");
      String className=sc.next();

      System.out.println("Enter marks of six subjects:");
      /*System.out.print("Enter marks of first Subject:");
      int s1=sc.nextInt();
      System.out.print("Enter marks of second Subject:");
      int s2=sc.nextInt();
      System.out.print("Enter marks of third Subject:");
      int s3=sc.nextInt();
      System.out.print("Enter marks of fourth Subject:");
      int s4=sc.nextInt();
      System.out.print("Enter marks of fifth Subject:");
      int s5=sc.nextInt();
      System.out.print("Enter marks of sixth Subject:");
      int s6=sc.nextInt();
   */
      double totalmarks=0.0;
      for(int i=1;i<=6;i++)
      {
         System.out.print("Enter marks of subject "+i +" ");
         totalmarks+=sc.nextDouble();
      }
    //  double totalmarks=s1+s2+s3+s4+s5+s6;
      double percentage=(totalmarks/6);
      Studentinfo stud=new Studentinfo(rollno,className,percentage);
      stud.display();
      sc.close();

   }
}