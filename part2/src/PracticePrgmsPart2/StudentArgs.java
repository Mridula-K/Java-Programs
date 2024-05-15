package PracticePrgmsPart2;

public class StudentArgs extends PersonArgs
{
	int id;
	double per;
	public StudentArgs(String name, int age, long contact, int id, double per)
	{
		super(name, age, contact);
		this.id = id;
		this.per = per;
	}
	public void displaySA()
	{
		System.out.println("ID "+id);
		System.out.println("PERCENTAGE "+per);
	}
	
	

}
