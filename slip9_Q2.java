import java.util.Scanner;

interface xyz{

}

class Product implements xyz{

    protected int product_id;
    protected String product_name;
    protected double product_cost;
    protected int product_quantity;
    protected static int objectcnt=0;
    public Product(){
       
    }

    public Product(int product_id,String product_name,double product_cost,int product_quantity)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_cost=product_cost;
        this.product_quantity=product_quantity;
        objectcnt++;
        System.out.println("Object count is "+obj_cnt());
    }

    public static int obj_cnt()
    {
        return objectcnt;
    }

    public void disply()
    {
        System.out.println(product_id+"\t"+product_name+"\t"+product_cost+"\t"+product_quantity+"\t");
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of objects:");
        int obj=input.nextInt();

        Product[] p=new Product[obj];

        for(int i=0;i<obj;i++)
        {
            System.out.print("Enter product id :");
            int id=input.nextInt();
            System.out.print("Enter name of product:");
            String name=input.next();
            System.out.print("Enter cost of product:");
            double cost=input.nextDouble();
            System.out.print("Enter quantity of product :");
            int quantity=input.nextInt();

            p[i]=new Product(id,name,cost,quantity);
        }

        System.out.println("id\tName\tCost\tquantity");
        for(int i=0;i<obj;i++)
        {
            p[i].disply();
        }

        System.out.println("Total number of object count is "+obj_cnt());
    }
}