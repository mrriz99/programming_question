public class ResetOfBit{
	public static void main(String[] args)
	{
		resetBit(22,5);
		
	}
	public static void resetBit(int n,int i)
	{
		int j=1<<(i-1);
		n=n&(~j);
		System.out.println(n);
	}
}