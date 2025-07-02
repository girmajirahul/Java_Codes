class Employee{
    private int id;
    private String name;
    private  float salary;

    public Employee(){
        id=1;
        name="Rahul";
        salary=2100.0f;
    }

    public Employee(int a,String b,float c){
        id=a;
        name=b;
        salary=c;
    }
    public void display(){
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
        System.out.println("SALARY="+salary);
    }
}

class MainEmployee{
    public static void main(String[] args){
        Employee emp1=new Employee(111,"Rahul",1200.00f);
        emp1.display();

        Employee emp2=new Employee();
        emp2.display();
    }
}