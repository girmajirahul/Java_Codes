//Write a Program to print all Prime numbers in an array of ‘n’ elements.
// (use command line arguments)


class PrimeNumbers
{
    public static void main(String[] args)
    {
        int n=args.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }

        System.out.println("The Array Elements are");
        for(int num:a)
        {
           
            if(isPrime(num))
            {
                System.out.print(num+"\t");
            }
        }

        
        
    }

    private static boolean  isPrime(int num)
        {
            if(num<=1)
                return false;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                    return false;
            }
            return true;
        }
}