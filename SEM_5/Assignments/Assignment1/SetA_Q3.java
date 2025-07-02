import java.util.Scanner;
public class SetA_Q3{
    public static int factorial(int no){
        int fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
       
       return fact;
    }

    public static double volume(float r,float h){
        double vol=3.14*(r*r)*h;
        return vol;
    }

    public static int amstrong(int num){
        int temp,sum=0;
        temp=num;
        while(num>0){
            int rem=num%10;
            sum=sum+(rem * rem *rem);
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args ){
      Scanner input=new Scanner(System.in);
      
      while(true)
      {
        System.out.println("1.volume of cylinder\n2.Factorial of given number\n3.Armstrong number\n4.Exit");
        System.out.print("Enter the choice:");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the radius :");
                float r=input.nextFloat();
                System.out.println("Enter the  height:");
                float h=input.nextFloat();
                double ans=volume(r,h);
                System.out.println("The volume of cylinder:"+ans);
                break;
            case 2:
                System.out.println("Enter the number:");
                int n=input.nextInt();
                int res=factorial(n);
                System.out.println("The Factorial of "+n+" is "+res);
            break;
            case 3:System.out.println("Enter the number:");
                    int num=input.nextInt();
                    int temp1=num;
                    int am=amstrong(num);
                    if(temp1==am){
                        System.out.println("Its a amstrong no");
                    }
                    else{
                        System.out.println("It is not amstrong no");
                    }
                    break;
            case 4:System.exit(0);
            break;
            default:
                System.out.println("Enter right choice !");   
        }
      }
    }
}