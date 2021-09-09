package javaQuestion;
import java .util.Scanner;


public class ReverseNum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
	    int x=sc.nextInt();
	    sc.close();
	    int rem=0;
	    int rev=0;
	     while(x!=0)
	     {
	    	 rem=x%10;
	    	 rev=rev*10+rem;
	    	 x=x/10;
	     }
	     System.out.println(rev);
		
		
	}

}
