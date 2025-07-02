import java.util.Scanner;



abstract class Order{
    protected int id;
    protected String description;

    public void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter id :");
        this.id=sc.nextInt();
        System.out.print("Enter description:");
        this.description=sc.next();

    }

    public void display()
    {
        System.out.print(id+"\t"+description+"\t");
    }
}

class PurchaseOrder extends Order
{
    protected String Customer_name;

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        super.accept();
        System.out.print("Enter customer name:");
        Customer_name=sc.next();
    }

    public void display()
    {
        super.display();
        System.out.println(Customer_name);
    }
}

class SalesOrder extends Order
{
    protected String Vendor_name;

    public void accept()
    {
        Scanner sc =new Scanner(System.in);
        super.accept();
        System.out.print("Enter vendor name:");
        Vendor_name=sc.next();
    }

    public void  display()
    {
        super.display();
        System.out.print(Vendor_name);
    }

}

class Main{
    public static void main(String[] args)
    {
        Order o=new PurchaseOrder();
        o.accept();
        o.display();

        Order sOrder=new SalesOrder();
        sOrder.accept();
        sOrder.display();
    }
}