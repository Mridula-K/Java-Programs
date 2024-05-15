package Series;

public class SquareSeriesEx 
{
	public static void square(int n)
	{
		for(int i = 1;i<=n;i++)
		{
			System.out.print(i*i + " ");
//			int j=i*i;
//			System.out.println(j);
		}
		System.out.println();
	}
	public static void cube(int n)
	{
		for(int i = 1;i<=n;i++)
		{
			System.out.print(i*i*i + " ");

		}
		System.out.println();
	}
public static void main(String[] args)
{
	square(10);
	cube(10);
}
}
