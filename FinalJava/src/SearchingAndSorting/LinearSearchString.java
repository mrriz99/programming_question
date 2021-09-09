package SearchingAndSorting;
import java.util.Scanner;

public class LinearSearchString {
	public static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args)
	{
		String [] array=inputStringArray();
		linearSearching(array);
		
	}
	public static String[] inputStringArray()
	{
		System.out.print("ente the size of the array=");
		int x=sc.nextInt();
		
		
		String[] arr=new String[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.print("enter the name at index"+i+"=");
			arr[i]=sc.next();
			System.out.println();
			
			
		}
		return arr;
	}
	public static void linearSearching(String[] arr)
{
		int temp=0;
		System.out.println("which number do you want=");
		String name=sc.next();
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i].equals(name))
			{
				System.out.println("element is found at index="+i);
				temp=temp+1;
			}
			
			
		}
		if(temp==0)
		{
			System.out.println("element was not found");
		}
		
		
	}

}
