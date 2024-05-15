package StringPrgms;

public class StringEx2 
{
public static void main(String[] args)  
{
	String s="Hello";
	String f=new String("Hai");//two ways we can create a string variable
	System.out.println(s);
	System.out.println(f);
	StringEx2.print();
	StringEx2.printalphabet();
}
public static void print()
{
	String a="Shiva";
	try//exception handling
	{
	System.out.println(a.charAt(0));
	System.out.println(a.charAt(1));
	System.out.println(a.charAt(2));
	System.out.println(a.charAt(3));
	System.out.println(a.charAt(5));
	}
	catch(StringIndexOutOfBoundsException s)
	{
		
	}
	System.out.println(a.charAt(4));
	System.out.println("            ");
}
public static void printalphabet()
{
	String h="Durga";
	for(int i=0;i<h.length();i++)
	{
		System.out.println(h.charAt(i));
	}
}
}
