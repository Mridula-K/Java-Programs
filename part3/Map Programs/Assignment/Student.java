package Assignment;

public class Student 
{
String name;
double percentage;
public Student(String name, double percentage)
{
	super();
	this.name = name;
	this.percentage = percentage;
}
public String toString()
{
	return "Student Name is "+name+" and "+"Percentage is "+percentage+"\n";
}

}
