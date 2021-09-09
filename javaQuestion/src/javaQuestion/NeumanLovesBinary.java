package javaQuestion;
import java.util.Scanner;
public class NeumanLovesBinary{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		//binary to decimal
		int [] array=inputArray();
		displayBinary(array);
		
		
		
		
	}
	public static int[] inputArray()
	{
		System.out.println("size=?");
		int x=sc.nextInt();
		int [] arr=new int[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
			
			
		}
		return arr;
		
	}
	public static void displayBinary(int[] arr)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int ans=0;
			int multipler=1;
			int rem=0;
			int num=arr[i];
			while(num!=0)
			{
				rem=num%10;
				ans=ans+rem*multipler;
				multipler=multipler*2;
				num=num/10;
				
				
				
			}
			System.out.println(ans);
		}
		
	}
	
	
}