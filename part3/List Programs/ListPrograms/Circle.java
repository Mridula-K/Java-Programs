package ListPrograms;

import java.util.ArrayList;

public class Circle 
{
float radius;
public Circle(float radius)
{
	this.radius=radius;
}
public String toString()
{
	return radius+" ";
}
//public void printCircle()
//{
//	System.out.println("The radius of circle is "+radius);
//}
public static void main(String[] args)
{
	ArrayList<Circle> b=new ArrayList<Circle>();
	Circle c1=new Circle(5.2f);
	b.add(c1);
	Circle c2=new Circle(10.12f);
	b.add(c2);
	Circle c3=new Circle(49.50f);
	b.add(c3);
	for(Circle i:b)
	{
		System.out.println("Radius is "+i);
	}
//	for(int i = 0;i<b.size();i++)
//	{
//		System.out.println("Radius is "+b.get(i));
//	}
//	

}



}
