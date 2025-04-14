/* 
Write a program to using marker interface create a class Product 
(product_id, product_name, product_cost, product_quantity) default and parameterized constructor. 
Create objectsof class product and 
display the contents of each object and Also display the object count.
*/

import java.util.Scanner;
interface xyz{

}

class Product implements xyz{
    protected int id;
    protected String name;
    protected double cost;
    protected int quantity;
    protected static int object_cnt=0;

    public Product(){

    }

    public Product(int id,String name,double cost,int quantity){
        this.id=id;
        this.name=name;
        this.cost=cost;
        this.quantity=quantity;
        object_cnt++;
        System.out.println("Object Count is :"+object_cnt());
    }

    public static int object_cnt(){
        return object_cnt;
    }

    public void display(){
        System.out.println(id+" "+name+" "+cost+" "+quantity);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers of objects:");
        int n=sc.nextInt();

        Product p[]=new Product[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter product id:");
            int id=sc.nextInt();
            System.out.print("Enter product name:");
            String name=sc.next();
            System.out.print("Enter product cost:");
            double cost=sc.nextDouble();
            System.out.print("Enter product quantity:");
            int quantity=sc.nextInt();
            p[i]=new Product(id,name,cost,quantity);
        }
        System.out.println("ID  Name  cost  Quantity");
        for(int i=0;i<n;i++){
            p[i].display();
        }

        System.out.print("Total number of objects Created is "+object_cnt());
    }
}