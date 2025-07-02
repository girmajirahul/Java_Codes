import java.util.Scanner;

class conditional_statements{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       /* System.out.print("Enter the age:");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }


        //To check year is leap year or not

        System.out.println("Enter the year:");
        int year=input.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }

       int m1,m2,m3;
        System.out.println("Enter the marks of first subject:");
        m1=input.nextInt();
        
        System.out.println("Enter the marks of Second subject:");
        m2=input.nextInt();
        
        System.out.println("Enter the marks of third subject:");
        m3=input.nextInt();

        float AVG=(m1+m2+m3)/3.0f;
        System.out.println("Average marks is="+AVG);
        if(AVG>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are pass ");
        }
        else{
            System.out.println("You are fail");
        }

        //else if
        float tax=0;
        System.out.println("Enter your income in lakh:");
        float income=input.nextInt();
        if(income<=2.5){
            tax=tax + 0;
        }
        else if(income>=2.5f && income<=5f){
            tax=tax + 0.05f * (income-2.5f);
        }
        else if(income>=5f && income<=10.0f){
            tax=tax + 0.2f * (income-5f);
        }
        else if(income>=10f){
            tax=tax + 0.05f * (income-10.0f);
        }

        System.out.println("The annual tax is ="+tax);
        
      
      //switch case
       */
       System.out.println("Enter the day:");
       String day=input.nextLine();
       switch(day)
       {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wesnesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter right day .");
       }

       
    }
}
