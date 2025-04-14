/* Create class Student with method SetDetails (int rollNo, string Name) 
using Anonymous class.*/

class Student{
    int rollNo;
    String name;
    public void SetDetails(int rollNo,String name){
        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args){
        Student stud=new Student(){
            public void SetDetails(int rollNo,String name){
                System.out.println("Rollno :"+rollNo+" Name:"+name);
            };
        };

        stud.SetDetails(101,"Rahul");
        stud.SetDetails(102,"Amit");
    } 
}