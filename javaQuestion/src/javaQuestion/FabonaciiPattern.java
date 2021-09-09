package javaQuestion;

public class FabonaciiPattern {

	public static void main(String[] args)
	{
		
		int a=0;
		int b=1;
		int j=1;
		
		
		int i=1;
		while(i<=4)
		{  
			int count=1;
			
			
					while(count<=j)
					{
						System.out.print(a);
						int sum=a+b;
						a=b;
						b=sum;
						count++;
						
						
					}
					System.out.println( );
					j++;
					i++;
					
					
				}
				
			}
			
		
		
	}

