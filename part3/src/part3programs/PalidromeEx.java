package part3programs;

public class PalidromeEx 
{
public static void main(String[] args) {
	String s="IOUOI";
	String p="";
	for(int i=s.length()-1;i>=0;i--)
	{
		p=p+s.charAt(i);
	}
		if(s.equalsIgnoreCase(p))
		{
			System.out.println("IT IS A PALINDROME");
		}
		else
		{
			System.out.println("IT IS NOT A PALINDROME");
		}
	}
}

