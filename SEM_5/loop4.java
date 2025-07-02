public class loop4{
    private static boolean isPrime(int num){
        int i;
        for(i=1;i<=num;i++){
            if(num%2==0){
                return false;
            }
       }
        return true;
    }
    public static void main(String s[]){
        int i,num;
        for(num=2;num<=100;num++){
            if(isPrime(num))
                System.out.print(num+"\t");
        }
    }
}