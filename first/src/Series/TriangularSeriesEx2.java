package Series;

public class TriangularSeriesEx2
{
	public static void triangle(int n)
	{
		int x=2;
		int d=13;
		for(int i=0;i<=n;i++)
		{
		System.out.print(x+" ");
		x=x+d;
		d=d*n;
	
		}
	}
public static void main(String[] args) {
	triangle(5);
}
}
