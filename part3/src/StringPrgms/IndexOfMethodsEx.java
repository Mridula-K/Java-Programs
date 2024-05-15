package StringPrgms;

public class IndexOfMethodsEx
{
public static void main(String[] args)
{
	String j="Elon Musk's x";
	int smallindex=j.indexOf('x');
	int capindex=j.indexOf('X');
	if(smallindex!=-1||capindex!=-1)
	{
		System.out.println("X is present");
	}
	else
	{
		System.out.println("X is not present");
	}
	

}
}
