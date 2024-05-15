package StringPrgms;

public class VowelEx1 
{
public static void main(String[] args)
{
String k="ABCDEFGHI";
for(int i=0;i<k.length();i++)
{
	char t=k.charAt(i);
	if(t=='A'||t=='E'||t=='O'||t=='I'||t=='U'||t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
	System.out.println(t+" is a vowel");
	else
		System.out.println(t+" is a consonant");
}
}
}
