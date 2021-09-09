package javaQuestion;
import java.util.Scanner;
public class CheckPrimeNumber{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("check prime number=");
		int n=sc.nextInt();
		sc.close();
		int div=2;
		boolean flag=true;
		while(div<=n-1)
		{
			if(n%div==0)
			{
				flag=false;
			}
			div=div+1;
			// it will give 1 as a prime number......
			
		}
		if(flag==true)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
		
	}
}