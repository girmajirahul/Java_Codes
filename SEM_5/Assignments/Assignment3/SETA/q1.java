import java.util.Scanner;

class continent
{
   String cont;
    public void accept_continent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the continent:");
         cont=sc.nextLine();
    }
   
}
class country extends continent
{   
    String Country;
    public void accept_country()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter country:");
        Country=sc.nextLine();
        
    }
}

class state extends country
{
    String State;
    public void accept_State()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter State:");
        State=sc.nextLine();
        
    }
}

class Place extends state
{
    String place;
     public void accept_place()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter place:");
        place=sc.nextLine();
        
    }
}

class Main
{
    public static void main(String[] args)
    {
        Place p=new Place();
        p.accept_continent();
        System.out.println("Continent is "+p.cont);
        p.accept_country();
        System.out.println("Country is "+p.Country);
        p.accept_State();
        System.out.println("State is "+p.State);
        p.accept_place();
        System.out.print("Place is "+p.place);
        
    }
}