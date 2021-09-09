
package javaQuestion;
import java.util.Scanner;
public class simpleCumlativeSum {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int  sum=0;
		
		while(sum>=0)
		{
			int  x=sc.nextInt();
			sum=sum+x;
			if(sum<0)
			break;
				System.out.println(x);
			
			
			
			
		}
	}

}
