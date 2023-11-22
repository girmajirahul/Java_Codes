/*Write a program to accept the username and password from user if username and password are
not same then raise "Invalid Password" with appropriate msg*/

import java.util.*;

class InvlidPasswordException extends Exception
{
    public InvlidPasswordException(String msg)
    {
        super(msg);
    }
}

class ValidPassword{
    public static void validatePassword(String username, String password) throws InvlidPasswordException
    {
        if(!username.equals(password))
        {
            throw new InvlidPasswordException("Username and password are not same");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username:");
        String username=sc.next();
        System.out.print("Enter password:");
        String password=sc.next();
        try
        {
            validatePassword(username,password);
            System.out.print("password is valid !");
        }
        catch(Exception e)
        {
            System.out.println("Invalid Password "+e.getMessage());
        }
    }
}