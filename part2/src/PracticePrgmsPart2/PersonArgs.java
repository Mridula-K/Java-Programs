package PracticePrgmsPart2;

public class PersonArgs 
{
	String name;
	int age;
	long contact;
	public PersonArgs(String name,int age,long contact)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
		
	}
	public void displayPA()
	{
		System.out.println("NAME "+name);
		System.out.println("AGE "+age);
		System.out.println("CONTACT "+contact);
		
	}

}
