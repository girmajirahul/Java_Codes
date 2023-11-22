import java.util.Scanner;
class ZeroException extends Exception{

    public ZeroException(String message){
        super(message);
    }
}

class Number{


    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for (int i=2;i<= Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws ZeroException
    {
        try{
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number:");
            int no=sc.nextInt();

            if(no==0)
                throw new ZeroException("Number is Zero");
            else{
                if(isPrime(no))
                    System.out.println(no+" is a prime number");
                else 
                    System.out.println(no+" is not prime number");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }

    }
}