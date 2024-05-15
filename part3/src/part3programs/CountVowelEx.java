package part3programs;

public class CountVowelEx 
{
public static void main(String[] args)
{
int i=0;
String a="ABCDEF";
for(int g = 0;g<a.length();g++)
{
	char e=a.charAt(g);
	switch(e)
	{
	case 'A','E','I','O','U','a','e','i','o','u':
	{
		i++;
	}
	break;
	default:
    }	
}
System.out.println("There is"+" "+i+" "+"vowels");
}
}
