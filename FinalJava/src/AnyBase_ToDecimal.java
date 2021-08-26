import java.util.Scanner;
public class AnyBase_ToDecimal{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number which you want to convert=");
		int x=Math.abs(sc.nextInt());
		System.out.println("Enter the Base of the number=");
		int y=Math.abs(sc.nextInt());
		sc.close();
		
		
		int res=AnyBaseToDecimal(x,y);
		System.out.println(res);
		
		
		
	}
	public static int  AnyBaseToDecimal(int x,int y)
	{
		int ans=0;
		int multiplier=1;
		while(x!=0)
		{
			int rem=x%10;
		     ans=ans+(rem*multiplier);
		     multiplier=multiplier*y;
		     x=x/10;
		     
	
		}
		return ans;
		
	}
}