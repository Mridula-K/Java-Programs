package Series;

public class CubeSeriesEx
{
	public static void cube(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i*i + " ");
		}
	}
public static void main(String[] args)
{
	cube(10);
}
}
