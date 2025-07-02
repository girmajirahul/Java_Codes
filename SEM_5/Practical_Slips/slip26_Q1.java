import java.util.*;

class Item{
    protected int item_no;
    protected String item_name;
    protected int item_price;
    protected static int objectcnt;
    public Item(int item_no,String item_name,int item_price)
    {
        this.item_no=item_no;
        this.item_name=item_name;
        this.item_price=item_price;
        objectcnt++;
        System.out.println("NUmber object "+get_objcount());
    }

    public static int get_objcount()
    {
        return objectcnt;
    }

    public void display()
    {
        System.out.println(item_no+"\t"+item_name+"\t"+item_price);
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of objects:");
        int n=sc.nextInt();
        Item[] item=new Item[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter item no:");
            int no=sc.nextInt();
            System.out.print("Enter item name:");
            String name=sc.next();
            System.out.print("Enter price:");
            int price=sc.nextInt();

            item[i]=new Item(no,name,price);
        }
        System.out.println("ItemNo  Name  Price");
        for(int i=0;i<n;i++)
        {
            item[i].display();
        }
    }
}