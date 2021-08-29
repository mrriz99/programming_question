public class ExatractBit{
	public static void main(String[] args)
	{
		extractIthBit(22,5);
		
		
	}
	public static void extractIthBit(int n ,int i)
	{
		int j=1<<(i-1);
		n=n&j;
		System.out.println(n);
		
	}
	
}