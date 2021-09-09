package javaQuestion;
import java.util.Scanner;
public  class PascalTraingle{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			int num=1;
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(j+"\t");
				}
				else
				{
					num=num*(i-j+1)/(j-1);
					System.out.print(num+"\t");
				}
				
				
			}
			System.out.println();
		}
		
	}
	
}