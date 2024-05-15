package studentPencil;

public class Student
{
int id;
String name;
public Student(int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return "Student name is "+name+"\n"+" The id is "+id;
}
}
