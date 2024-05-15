package Assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class AsciiEx 
{
	public static void main(String[] args) 
	{
	HashMap<Character, Integer> m=new HashMap<Character, Integer>();
	m.put('M', 77);
	m.put('k', 107);
	m.put('C', 67);
	m.put('v', 118);
	m.put('*', 42);
	System.out.println("Elements " + m);//m.entrySet()
	System.out.println("Keys are "+m.keySet());
	System.out.println("Values are "+m.values());
	System.out.println("Is 'q' present in the map: "+m.containsKey('q'));
	TreeMap<Character, Integer> k=new TreeMap<Character, Integer>(m);
	System.out.println("----------------------------------------");
	System.out.println("Sorted Order :");
	System.out.println(k);

	}
}
