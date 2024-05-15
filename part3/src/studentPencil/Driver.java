package studentPencil;

import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args) 
	{
		ArrayList<Object> g=new ArrayList<Object>();
		Student s1=new Student(123,"Sai");
		g.add(s1);
		Pencil p1=new Pencil(25,"Blue");
		g.add(p1);
		Student s2=new Student(231,"Shiva");
		g.add(s2);
		Pencil p2=new Pencil(20,"Red");
		g.add(p2);
		Student s3=new Student(321,"Vishnu");
		g.add(s3);
		Pencil p3=new Pencil(10,"Yellow");
		g.add(p3);
		
		for(Object i:g)
		{
			System.out.println(i);
		}
		
	}

}
