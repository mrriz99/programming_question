public class FunReturnValue{
	public static void main(String[] args)
	{
		System.out.println("Function_Return_Value");
	    int sum=addition(10,20);
	    System.out.println(sum);
	    if(sum>1)
	    {
	    	System.out.println("my name is rahul sharma");
	    	
	    }
	    else
	    {
	    	System.out.println("your name is dog");
	    }
	    
	}
	
	
	//return value type
	public  static int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}