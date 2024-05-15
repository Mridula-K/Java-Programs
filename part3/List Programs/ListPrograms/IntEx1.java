package ListPrograms;

import java.util.ArrayList;

public class IntEx1
{
public static void main(String[] args)
{
ArrayList<Integer> j=new ArrayList<Integer>();
j.add(12);
j.add(15);
j.add(18);
j.add(24);
j.add(25);
for(Integer i:j)
{
	if(i%2==0)
	{
		System.out.println(i);
	}
}
}
}
