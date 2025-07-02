
class cmdline
{ 
 public static void main(String args[]) 
 {  int f1,f2=0,f3=1;
    int num1=Integer.parseInt(args[0]); 
    int num2=Integer.parseInt(args[1]); 
    int num=Integer.parseInt(args[2]);
    int result=0; 
    result=num1+num2; 
    System.out.println("Addition of two numbers is: " +result); 
  //Fibonacii Series 
    System.out.println("Fibonacci series are: ");
    for(int i=0;i<=num;i++)
    {
        System.out.print(f3+" ");
        f1=f2;
        f2=f3;
        f3=f1+f2;
       
    }
 } 
}