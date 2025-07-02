import java.io.*;
import java.util.*;

public class EvenNumbers{
	public static void main(String[] args)
	{
		int n,num=0;
		FileOutputStream fos= new FileOutputStream("even.txt");	
		DataOutputStream dos=new DataOutputStream(fos);
		System.out.println("How many numbers :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			num=sc.nextInt();
			if(num %2==0)
				dos.write(num);
		}	
		//dos.close();
	}
}
	