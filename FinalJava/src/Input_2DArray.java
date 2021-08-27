import java.util.Scanner;
public class Input_2DArray{
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//2D dimensional Array
		int [][] array=inputArray();
		display(array);
		
	}
	public static int [][] inputArray()
	{
		System.out.println("Size?=");
		int x=Math.abs(sc.nextInt());
		int [][] arr=new int [x][x];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println("enter the value at index :"+i+" "+j+"=");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	
	public static void display(int [][] arr)
	
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}
}