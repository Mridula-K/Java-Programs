package StringPrgms;

public class StringEx4
{
public static void main(String[] args) 
{
	String d="OM ";
	System.out.println(d.concat("SAI RAM"));
	String a=" OM NAMO NARAYANA";
     System.out.println(a.length());
     a=a.trim();
     System.out.println(a.length());
    String h="java";
 	String i="JAVA";
 	System.out.println(h.equals(i));
 	System.out.println(h.equalsIgnoreCase(i));
 	StringEx4.methodsFrom7();
}

public static void methodsFrom7() 
{
	String c="LovedYoudAmma";
	String d[]=c.split("d");
	for(int i=0;i<d.length;i++)
	{
	System.out.println(d[i]);	
	}
	
	
}
}
