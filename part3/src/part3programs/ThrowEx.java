package part3programs;

import java.util.Scanner;

public class ThrowEx 
{
	private static final Exception InvalidAgeException = null;

	public static void main(String[] args) throws Exception
	{
	System.out.println("ENTER TWO VALUES");
	Scanner h=new Scanner(System.in);
	int a=h.nextInt();
	int b=h.nextInt();
	h.close();
	if(a<0)
	{
		throw InvalidAgeException;
	}
	System.out.println(b);
	}

}
