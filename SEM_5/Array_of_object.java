import java.util.*;
class student{
    private int id;
    private String name;

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the id :");
        this.id=sc.nextInt();
        System.out.print("Enter teh name:");
        this.name=sc.next();
    }
    public void display(){
        System.out.println(this.id+"\t"+this.name);
    }

}

 class TestStudent {
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    //int n=obj.nextInt();
    student st[]=new student[3];  //Array of refernces
    for(int i=0;i<st.length;i++){
        st[i]=new student();  //create object one by one
        st[i].accept();
       //
    }

    System.out.println("Id\tName");
    for(int i=0;i<st.length;i++){
         st[i].display();
    }

  }
}