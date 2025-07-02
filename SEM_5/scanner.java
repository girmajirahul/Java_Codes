import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in); // creates a Scanner object 
    System.out.println("Enter an integer: "); 
    int number = input.nextInt(); // reads an int value 
    System.out.println("Number using nextInt(): " + number); 
    input.close(); 
    }
}