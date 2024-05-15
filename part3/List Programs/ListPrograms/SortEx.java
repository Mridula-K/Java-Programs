package ListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx 
{
	public static void main(String[] args)
	{
		ArrayList<String> d=new ArrayList<String>();
		d.add("123btm");
		d.add("btm123");
		d.add("123");
		d.add("BTM");
//		Collections.sort(d,Collections.reverseOrder());
//		System.out.println(d);
//		for(String u:d)
//		{
//			System.out.println(u);
//		}
		Collections.sort(d);
		System.out.println(d);
		for(int i=d.size()-1;i>=0;i--)
		{
			System.out.println(d.get(i));
		}
	}

}
