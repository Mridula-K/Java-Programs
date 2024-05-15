package PracticePrgmsPart2;

public class Person {
	String name;
	int age;
	long contact;
	public Person()
	{
		System.out.println("Parent members loading");
	}
	public void displayP()
	{
		System.out.println("NAME" + " "+name);
		System.out.println("AGE" + " "+age);
		System.out.println("CONTACT" + " "+contact);
	}

}
