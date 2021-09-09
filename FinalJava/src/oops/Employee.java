package oops;

public class Employee {
	String name;
	int id;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(this.id);
		
	}

	public static void main(String[] args) {
		Employee rishab=new Employee("delhi",101);
		Employee rahul=new Employee("haryana",102);
		Employee deepak=new Employee("sri lanka",103);

	}

}
