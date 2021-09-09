package javaQuestion;
public class Swap{
	public static void main(String[] args)
	{
		int a=10;int b=20;
		System.out.println(a+" "+b);
		swapping(10,20);
		System.out.println(a+" "+b);
		
		
		
	}
	public static void swapping(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
	}
}