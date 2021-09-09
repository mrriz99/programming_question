package SearchingAndSorting;
import java.util.Scanner;

public class LineraSearching {
	public static  Scanner sc=new Scanner(System.in);

	
	public static void main(String[] args)
	{
		
		int [] array=inputArray();
		linearSearching(array);
		
	}
	public static int[] inputArray()
	{
		System.out.print("size of array=");
		int x=sc.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("enter the number at index"+i+"=" );
			arr[i]=sc.nextInt();
			System.out.println();
		}
		return arr;
	}
	
	public static void linearSearching(int[] arr)
	{
		int temp=0;
		System.out.println("which number ddo you want=");
		int x=sc.nextInt();
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("element is found at index="+i);
				temp=temp+1;
			}
			
			
		}
		if(temp==0)
		{
			System.out.println("element was not founded");
		}
		
		
	}

}
