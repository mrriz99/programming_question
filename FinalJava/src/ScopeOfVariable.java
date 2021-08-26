public class ScopeOfVariable{
	
	public static int papu=100;//global variable
	public static void main(String[] args)
	{
		int  papu=1000;//local variable
		System.out.println("rahul ka elaka h ye="+ScopeOfVariable.papu);
		int sum=addition(10);
		System.out.println(sum);
	}
	public static int addition(int a)
	{
		int sum=a+papu;//use global function
		return sum;
		
	}
}