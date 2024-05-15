package Series;

public class TriangularSeriesEx
{
public static void triangle(int n)
{
	int x=1;
	int d=2;
	for(int i=0;i<=n;i++)
	{
		System.out.print(x +" ");
		x=x+d;
        d++;
	}
}
	public static void main(String[] args) 
	{
	triangle(5);
    }
}
