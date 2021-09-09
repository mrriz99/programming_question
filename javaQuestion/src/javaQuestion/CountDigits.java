package javaQuestion;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int n=sc.nextInt();
		System.out.println("which number to count=");
		int r=sc.nextInt();
		sc.close();
		
		int count=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==r)
			{
				count=count+1;
				
			}
			n=n/10;
			
			
		}
		System.out.println(count);		
		
	}
}
