import java.util.Scanner;
public class Array_Input {
	 public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		//This program is all about of entering array
		int [] array=inputArray();
		display(array);
		
		
		

	}
	public static int[] inputArray()
	{
		System.out.println("Size?=");
		int x=sc.nextInt();
		int [] arr=new int [x];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the value of the index "+i+"=");
			arr[i]=sc.nextInt();
		}
		
		return arr;
		
	}
	
	public static void display(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
