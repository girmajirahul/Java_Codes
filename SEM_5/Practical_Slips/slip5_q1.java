/*

Q1) Write a program for multilevel inheritance such that Country is inherited from Continent.
 State is inherited from Country. Display the place, State, Country and Continent.

*/
import java.util.*;
class Continent 
{
    protected String continent;

    public void accept_continent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the continent:");
        this.continent=sc.next();
    }
    public void display_continent()
    {
        System.out.println("Continent is "+continent);
    }
}

class Country extends Continent
{
    protected String country;

    public void accept_country()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the country:");
        this.country=sc.next();
    }
    public void display_country()
    {
        System.out.println("Country is "+country);
    }
}

class State extends Country
{
    protected String state;
    protected String place;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the State:");
        this.state=sc.next();
        System.out.println("Enter the place:");
        this.place=sc.next();
    }
    public void display()
    {
        System.out.println("State is "+state);
        System.out.println("Place is :"+place);
    }
}

 class ClassTest {
  public static void main(String[] args){

        State st=new State();
        st.accept();
        st.display();
        st.accept_continent();
        st.display_continent();
        st.accept_country();
        st.display_country();
  }
}