/*
Q1) Create a class Sphere, to calculate the volume and surface area of sphere.
 (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))

*/

import java.util.*;
class Sphere
{
    public static double radius;
    public  void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        this.radius=sc.nextDouble();

    }

    public static double Area()
    {
        double area=4*3.14*(radius * radius);
       // System.out.print("Area of Sphere is:"+area);
        return area;
    }

    public static double Volume()
    {
        double volume=((4.0/3.0)*3.14*(radius * radius * radius));
        return volume;
    }

    public static void main(String[] args)
    {
        Sphere s=new Sphere();
        Scanner input=new Scanner(System.in);
        System.out.println("1.Calculate area of Sphere\n2.Calculate volume of Sphere");
        s.accept();
        System.out.println("Area of Sphere is :"+s.Area());
        System.out.println("Volume of Sphere is :"+s.Volume());
    }
}
