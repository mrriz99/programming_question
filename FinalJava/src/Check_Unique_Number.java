import java.util.Scanner;

public class Check_Unique_Number {
	public static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		int [] array=inputArray();
		display(array);
		
		// check_unique_number by xor bitwise operator
		

	}
	public static int [] inputArray()
	{
		System.out.println("size?=");
		int x=Math.abs(sc.nextInt());
		int [] arr=new int[x];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the value at index "+i+"=");
			arr[i]=sc.nextInt();
		}
		return arr;
		
		
	}
	
	
	public static void display(int [] arr)
	{
		
		int res=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			res=res^arr[i];
			
		}
		System.out.println("Displaying the unique number="+res);
		
		
		
	}
	

}
