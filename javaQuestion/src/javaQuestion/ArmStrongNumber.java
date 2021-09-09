package javaQuestion;
import java.util.Scanner;


public class ArmStrongNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int n=sc.nextInt();
		sc.close();
		//finding of length
		int t1;
		int len=0;
		
		while(n!=0)
		{
			t1=n/10;
		   len=len+1;	
		  
		}
		int t2=0;
		int ans=1;
		int arm=0;
		
		while(t2!=0)
		{
			t2=n%10;
		 	for(int j=1;j<=len;j++)
		 	{
		 		 ans=ans*t2;
		 	}
		   n=n/10;
		   arm=arm+ans;
			
		}
		if(arm==n)
		{
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("this is not a armstrong number");
		}
		
		
	}
}
