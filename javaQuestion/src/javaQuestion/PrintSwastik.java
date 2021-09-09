package javaQuestion;
import java.util.Scanner;

public class PrintSwastik {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		//print phase 1
		System.out.print("*");
		
		for(int i=1;i<=(n-3)/2;i++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=(n+1)/2;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//print phase 2
		for(int rows=1;rows<=(n-3)/2;rows++)
		{
			System.out.print("*");
			for(int i=1;i<=(n-3)/2;i++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			
			
		}
		//print phase 3
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//print phase 4
		for(int rows=1;rows<=(n-3)/2;rows++)
		{
			//space
			for(int i=1;i<=((n-3)/2)+1;i++)
			{
				System.out.print(" ");
			}
			
			//star
			System.out.print("*");
			//space
			for(int i=1;i<=(n-3)/2;i++)
			{
				System.out.print(" ");
			}
			
			//star
			System.out.print("*");
			System.out.println();
		}
		
		//print phase 5
		for(int i=1;i<=(n-3);i++)
		{
			System.out.print("*");
		}
		
		
		for(int i=1;i<=(n-3)/2;i++)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
		
	}

}
