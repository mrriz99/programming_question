package javaQuestion;
import java.util.Scanner;
public class ManMohanLovePattern{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows(>1or<=1000)=");
		int n=Math.abs(sc.nextInt());
		sc.close();
		int x=-2;
		if(n>1000||n<1)
		{
			System.out.println("number must be in range of >1 or <=1000");
		}
		else
		{
			
				
		for(int i=1;i<=n;i++)
		{
			if(x<1)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("1");
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					if(i%2==0)
					{
						if(j==1||j==i)
						{
							System.out.print("1");
						}
						else
						{
							System.out.print("0");
						}
					
					}
					else
					{
						System.out.print("1");
					}
				}
			}
			
			System.out.println();
			x++;
		}
		}
		
		
	}
}