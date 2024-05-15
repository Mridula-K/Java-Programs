package numbers;

public class checkNumber 
{
public static boolean check(int n)//0(Sqrt(n))
{
	if(n<=0)
	{
		return false;
	}
	else if(n==2||n==3)//even prime
	{
		return true;
	}
	else if(n%2==0||n%3==0)//even non prime
	{
		return false;
	}
	for(int i=5;i<=Math.sqrt(n);i=i+2)//odd non prime
	{
	if(n%i==0)
	{
		return false;
	}
	}
	return true; //odd prime
}
public static void main(String[] args)
{
	System.out.println(check(167));
}

}
