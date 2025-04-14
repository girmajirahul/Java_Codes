/** 
Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject. 
Accept date as dd,mm,yyyy. Throw user  defined exception "InvalidDateException" if the date  is invalid.
Example of invalid date :03 15 2019 , 31 6 2000 , 29 2 2021

*/

import java.util.Scanner;
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day, month, year;

   
    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    private boolean isValidDate(int day, int month, int year) {
        
        if (month < 1 || month > 12){
            return false;
        } 

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        
        return day >= 1 && day <= daysInMonth[month];
    }

    
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    
    public void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }
}


class DateValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
           
            System.out.print("Enter day: ");
            int day = sc.nextInt();
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            MyDate date = new MyDate(day, month, year);
            date.display();
           

        } catch (InvalidDateException e) {
            System.out.println(e.getMessage()); 
        } 
    }
}
