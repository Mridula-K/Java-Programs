package Series;

public class ZigzagSeriesEx 
{
	public static void zigzag(int n)
	{
	int x=10;
	int y=5;
	for(int i=1;i<=n;i++)
	{
		
		if(i%2==1)
		{
			System.out.print(x+" ");
			x=x+50;
		}
		else
		{
			System.out.print(y+" ");
			y=y+10;
		}
	}
	}
	
public static void main(String[] args) 
{
	zigzag(10);
}
}
