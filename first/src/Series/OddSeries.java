package Series;

public class OddSeries
{
	public static void print(int n)
	{
		int x=1;
		for(int i=0;i<=n;i++)
		{
			System.out.print(x+" ");
			x=x+2;
		}
	}
public static void main(String[] args) {
	print(10);
}
}
