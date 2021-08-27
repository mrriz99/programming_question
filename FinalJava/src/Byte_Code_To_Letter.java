public class Byte_Code_To_Letter
{
	public static void main(String[] args)
	{
		byte [] b= {101,102,103,104};
		String str1=new String(b);
		System.out.println(str1);
		
		// why it is better to save password in char Array then string
		// char array dont print value directly
		//example

	  char[] ch=new char[]{'R','A','H','U','L'};
	  String str2=new String(ch);
	  System.out.println("char="+ch);
	  System.out.println("string="+str2);
	  
	  
	}
}