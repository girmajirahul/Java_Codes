import java.util.Arrays;
class CommandLineSort {
    public static void main(String[] args){
        if (args.length != 5) {
            System.out.println("Please provide 5 numbers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
           numbers[i]=Integer.parseInt(args[i]);
           
        }

       // Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<(numbers.length-i-1);j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print("\t"+num);
        }
    }
}
