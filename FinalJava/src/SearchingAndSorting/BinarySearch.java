package SearchingAndSorting;
import java.util.Scanner;

public class BinarySearch {
	public static  Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String [] array=inputArray();
		binarySearch(array);
		
	}
	public static String[] inputArray()
	{
		
		System.out.println("array element must be sorted");
		System.out.print("size of array=");
		int x=sc.nextInt();
		String[] arr=new String[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("enter the number at index"+i+"=" );
			arr[i]=sc.next();
			System.out.println();
		}
		return arr;
	}
	public static void binarySearch(String[] arr)
	{
		System.out.println("which number do yo find out=");
		String x=sc.next();
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		
		
		while(li<=hi)
		{
			mi=(li+hi)/2;
			int res=x.compareTo(arr[mi]);
			if(res==0)
			{
				System.out.println("element was found at index"+mi);break;
				
			}
			else if(res>0)
			{
				li=mi+1;
				
				
			}
			else
			{
				hi=mi-1;
			}
			
			
		}
		if(li>hi)
		{
			System.out.println("element was not found");
		}
		
			
		
		
	}
	

}
