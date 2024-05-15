package PracticePrgmsPart2;

public class Student extends Person
{
	int id;
	float per;
	public Student()
	{
		System.out.println("CHILD MEMBERS LOADING....");
	}
public void displayS()
{
	System.out.println("ID"+" "+id);
	System.out.println("PERCENTAGE"+" "+per);
}
}
