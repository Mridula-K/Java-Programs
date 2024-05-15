package mobileEx;

import java.util.LinkedList;

public class Driver
{
public static void main(String[] args)
{
	LinkedList<Mobile> r=new LinkedList<Mobile>();
//	Mobile m1=new Mobile("Apple Iphone 15",150000);
//	r.add(m1);
	r.add(new Mobile("Apple Iphone 15",150000));
	Mobile m2=new Mobile("MI Note 13",50000);
	r.add(m2);
	Mobile m3=new Mobile("Samsung Galaxy",75000);
	r.add(m3);
	Mobile m4=new Mobile("Nokia",10000);
	r.add(m4);
	System.out.println(r);
	System.out.println(r.peek());
//	System.out.println(r.peekLast());
	System.out.println(r.poll());

//	System.out.println(r.pollLast());
//	for(int i=0;i<r.size();i++)
//	{
//		if(r.get(i).price>50000)
//		{
//			System.out.println(r.get(i).toString());
//		}
//	}
		
//	for(Mobile i:r)
//	{
//		if(i.price>50000)
//		{
//			System.out.println(i);
//		}
//	}
}
}
