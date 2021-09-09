package javaQuestion;
import java.util.Scanner;

public class PrintNPrimeNumber {
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("starting Number=");
       int x=sc.nextInt();
       System.out.println("Ending Number");
       int n=sc.nextInt();
       //print prime number between a number;
       
       sc.close();
       int primeNumber=0;
       for(int i=x;i<=n;i++)
       {
    	   int count=0;
    	   for(int num=i;num>=1;num--)
    	   { 
    		   if(i%num==0)
    		   {
    			   count=count+1;
    			   
    		   }
    	   }
    	   if(count==2)
    	   { 
    		   primeNumber=primeNumber+i;
    		   System.out.println(primeNumber);
    		   
    	   }
    	   primeNumber=0;
    	   
       }
		
	}

}
