
import java.util.Scanner;

interface operations
{
     void  volume();
}

class cylinder implements operations
{
    public double radius;
    public double height;
    public final double  PI=3.142;
    public void  volume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of Cylinnder:");
        this.radius=sc.nextDouble();
        System.out.print("Enter the height of the Cylinder:");
        this.height=sc.nextDouble();

        double vol=PI * radius * radius * height;

        System.out.println("volume of cylinder is "+vol);
    }

    public static void main(String[] args)
    {
        cylinder cy= new cylinder();
        cy.volume();
       ///System.out.println("The volume of cylinder is "+v);
    }
}