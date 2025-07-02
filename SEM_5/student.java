class Student
 {
    int id;//declaration of data member or instance variable
    String name;
    public static void main(String args[]) //creating main
    {
        Student s1=new Student();//creating an object of Student
        System.out.println("Student id = "+s1.id);
        //accessing member through reference variable
         System.out.println("Student name = "+s1.name);
    }
 } 
