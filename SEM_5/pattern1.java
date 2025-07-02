import java.util.Scanner; 
public class Pattern3 
{ 
    public static void main(String[] args)
    { 
        int lim; 
        Scanner sc = new Scanner(System.in); // creates an object of Scanner 
        System.out.print("Enter your limit: "); 
        lim = sc.nextInt(); // takes input from the keyboard 
       char ch = '*'; 
        for(int i=1 ;i<=lim;i++) 
        { 
            for(int j = 1; j<=i ;j++) 
            { 
                System.out.print("\t"+ch); 
            }
            System.out.println();
        } 
    } //i loop 
}