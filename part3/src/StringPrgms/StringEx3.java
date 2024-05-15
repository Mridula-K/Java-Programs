package StringPrgms;

public class StringEx3 
{
	static String h="Om nama shivaya";
public static void main(String[] args) 
{
	int p=h.length();
	System.out.println("THE LENGTH OF THE STRING IS "+p);
	StringEx3.alpha();
	System.out.println(h);
}
public static void alpha()
{
	System.out.println(h.toUpperCase());
	System.out.println(h.toLowerCase());
	
}
public String toUppercase()
{
	return h; 
}
}