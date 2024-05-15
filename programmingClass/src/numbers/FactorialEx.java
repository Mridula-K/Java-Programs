package numbers;

public class FactorialEx
{
public static long fact(int y)//if we use long,we can find till 20!
{
	long res=1l;//if we use int, we can find upto 12!(12 factorial)
	for(int i=y;i>=1;i--)
	{
		res=res*i;
	}
	return res;
}
public static int pow(int b,int p)
{
	int res=1;
	for(int i=1;i<=p;i++)
	{
		res=res*b;
	}
	return res;
}
public static void main(String[] args)
{
	System.out.println(fact(5));
	System.out.println(pow(2,5));//syso(Math.pow(double x,double y))
}
}

