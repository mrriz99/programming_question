public class String_Test{
	public static void main(String[] args)
	{
		String str1="rahul";
		String str2="rahul";
		String str3=new String();
		String str4=new String("DDD");
		String str5= new String("CCCC");
		
		//== it checks the memory location of the value
		System.out.println("1)"+str1==str2);
		
		//.equals() it checks the memory value is equal or not
		System.out.println("2)"+str1.equals(str2));
		
		
		//length() it will give the length of the value
		System.out.println("3)"+str1.length());
		
		// .isEmpty() it check the object have value or not
		System.out.println("4)"+str3.isEmpty());
		System.out.println("5)"+str2.isEmpty());
		
		//.trim() it basically delete right and leftmost white space
		System.out.println("6)"+str1.trim());
		
		//.equalTgnoreCase is basically use for ignore case in alphabate
		
		System.out.println("7)"+str4.equalsIgnoreCase(str5));
		
		//compareTo is use for check first digit check which is greater
		System.out.println("8)"+str4.compareTo(str5));
		
		System.out.println("9)"+str4.compareToIgnoreCase(str5));
		
		//concat is use for the addit0in of the string
		System.out.println("10)"+str1+str2);
		String str6=str1.concat(str5);
		System.out.println("11)"+str6);
		String str7="ramnath";
		//join is use for the add some character in between two string
		System.out.println("12)"+String.join("&",str1,str7));
		String str8="this isademoclass";
		
		System.out.println("13)"+str8.subSequence(3,9));
		System.out.println("14)"+str8.substring(3));
		System.out.println("15)"+str8.substring(3,9));
		System.out.println("16)"+str8.replace("is","was"));
		System.out.println("17)"+str8.replaceFirst("is","was"));
		System.out.println("18)"+str8.replaceAll("is","was"));
		System.out.println("19)"+str8.replaceAll("is(?)","was"));//? * .etc .... regex
		
		
		
		//string Searching methrod
		
		
		String str9="heLlo";
		System.out.println("20)"+str9.indexOf("lo"));
		System.out.println("21)"+str9.lastIndexOf('l'));
		System.out.println("22)"+str9.contains("hel"));
		System.out.println("23)"+str9.endsWith("0"));
		System.out.println("24)"+str9.startsWith("he"));
		System.out.println("25)"+str9.toUpperCase());
		System.out.println("26)"+str9.toLowerCase());
		
		int a=10;
		String str10=String.valueOf(a);
		System.out.println("27)"+str4+str10+str1);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}