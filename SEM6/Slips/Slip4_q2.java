import java.io.*;
import java.util.*;

class CitySTDCode{
    public static void main(String[] args){
        int choice;
        String City,Code;
        Scanner sc=new Scanner(System.in);

        HashMap<String,String> city=new HashMap<String,String>();
        while(true){
           
            System.out.println("1.Add a new City and its StdCode");
            System.out.println("2.Remove city");
            System.out.println("3. Search for city name and display the  code:");
            System.out.println("4.Exit");
             System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:System.out.print("Enter city name");
                    City=sc.next();
                    System.out.print("Enter code:");
                    Code=sc.next();
                    if(city.containsKey(City))
                    {   
                        System.out.print("City alreday exists.");
                    }
                    else{
                        city.put(City,Code);
                        System.out.println("City Added successFully.");
                    }
                    break;

                case 2:
                    System.out.println("Enter City name to be removed:");
                    City=sc.next();
                    if(city.containsKey(City)){
                        city.remove(City);
                        System.out.println("City removed succesfully.");
                    }
                    else{
                        System.out.println("City not found.");
                    }
                    break;
                case 3:
                        System.out.println("Enter city name to search:");
                        City=sc.next();
                        if(city.containsKey(City)){
                            System.out.println("STD code for "+ City +" is "+ city.get(City));
                        }
                        else{
                            System.out.print("City not found.");
                        }
                        break;
                case 4:
                        System.exit(0);
                        break;
            }
        }
    }
}