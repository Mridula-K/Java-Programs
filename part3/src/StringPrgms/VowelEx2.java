package StringPrgms;

public class VowelEx2
{
public static void main(String[] args)
{

	int g=0;
	String c="ABCDEFGHI";
	for(int i=0;i<c.length();i++)
	{
		char f=c.charAt(i);
	switch(f)
	{
	case 'A','E','I','O','U':
	{
	g++;
	}
	break;
	default:
	}
}
	System.out.println("The number of vowels are "+g);

}
}
