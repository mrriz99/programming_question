package javaQuestion;
import java.util.Scanner;

public class KajrewalEvenOdd{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car number=");
		
		int n=sc.nextInt();
		sc.close();
		int rem=0;
		int sum=0;
		int sum1=0;
		while(n!=0)
		{
			for(int i=1;i<=2;i++)
			{
				rem=n%10;
				sum1=sum1+rem;
				n=n/10;
			}
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			
			
		}
		if(sum%3==0||sum1%4==0)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
		
		
	}
}