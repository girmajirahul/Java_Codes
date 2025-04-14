/*
Write a program to accept a number from the user, if number is zero 
then throw user defined exception Number is 0 
otherwise check whether no is prime or not (Use static keyword).
*/

import java.util.Scanner;
class ZeroNumberException extends Exception{
    public ZeroNumberException(String message){
        super(message);
    }
}

class CheckPrime{
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for(int i=2;i<= Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        try{
            System.out.print("Enter the number:");
            int n=sc.nextInt();
            if(n<=0){
                throw new ZeroNumberException("Number is zero");
            }
            else{
                if(isPrime(n)){System.out.print(n+" is Prime Number");}
                else{System.out.print(n+" is not prime number");}
            }
        }catch(Exception e){
             System.out.print("Error  "+e.getMessage());   
        }
    }
}