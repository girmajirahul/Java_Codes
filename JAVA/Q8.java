/**
 Create a hashtable containing city name & STD code. 
 Display the details of the hashtable. 
 Also search for a specific city and display STD code of that city
 */
import java.io.*;
import java.util.*;

class Cities {
    public static void main(String[] args){
        Hashtable<String,Integer> city=new Hashtable<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of cities:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter name:");
            String cityname=sc.next();
            System.out.print("Enter STD code:");
            int stdcode=sc.nextInt();

            city.put(cityname,stdcode);
        }

         System.out.println("\nCity STD Codes:");
        for (Map.Entry<String, Integer> entry : city.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       while(true){
         System.out.print("\nEnter city name to search: ");
        String searchCity = sc.next();

        if (city.containsKey(searchCity)) {
            System.out.println("STD Code of " + searchCity + " is: " + city.get(searchCity));
        } else {
            System.out.println(searchCity + " not found in the records.");
        }
       }

    }
}