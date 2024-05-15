package StringPrgms;

public class PalindromeEx1
{
	public static void main(String[] args) 
	{
		String l="MALAYALAM";
		String m="";
		for(int i=l.length()-1;i>=0;i--)
		{
			m=m+l.charAt(i);
			System.out.println(m);
		}
		if(l.equalsIgnoreCase(m))
		System.out.println("It is a palindrome");
		else
		System.out.println("It is not a palindrome");
	}

	

}
