/*
Write a program to read the First Name and Last Name of a person, his weight and height using
 command line arguments. Calculate the BMI Index which is defined as the individual's body mass
 divided by the square of their height.
 (Hint : BMI = Wts. In kgs / (ht)2)
*/
import java.util.Scanner;

class person
{
  

    public static void main(String[] args)
    {
        
        String fname=args[0];
        String lname=args[1];
        double height=Double.parseDouble(args[2]);
        double weight=Double.parseDouble(args[3]);
       

        double BMI=weight/(height * height);

        System.out.println("The BMI of "+fname+" "+lname+" is ="+BMI);
    }

}