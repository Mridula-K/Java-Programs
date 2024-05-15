package polymorphismPrograms;

import java.util.Scanner;

public class UserApp
{
public static void main(String[] args)
{
	boolean k;
	Scanner m=new Scanner(System.in);
	do
	{
	System.out.println("Enter 1 for Circle");
	System.out.println("Enter 2 for Rectangle");
	int s=m.nextInt();

	switch(s)
	{
	case 1:Circle c=new Circle();
	UserApp.select(c);
	break;
	case 2:Rectangle r=new Rectangle();
	UserApp.select(r);
	break;
	default:System.out.println("WRONG INPUT");
	}//switch ends
	System.out.println("Do you want to repeat?!");
	System.out.println("Enter true to repeat");
	System.out.println("Enter false to exit");
	k=m.nextBoolean();
	}//do ends
	while(k);
	
	m.close();
}
public static void select(Shape ob)
{
	ob.draw();
	if(ob instanceof Circle)
	{
		Circle a=(Circle)ob;
		a.printC();
	}
	else
	{
		Rectangle b=(Rectangle)ob;
		b.printR();
	}
}	
	
}