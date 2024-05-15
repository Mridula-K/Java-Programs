package polymorphismPrograms;

import java.util.Scanner;

public class User
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A for Mini Ride");
		System.out.println("Enter B for Auto Ride");
		System.out.println("Enter C for Sedan Ride");
		char u=s.next().charAt(0);
		
		switch(u)
		{
		case 'A':
		Mini m=new Mini();
		User.book(m);
		break;
		case 'B':
        Auto a=new Auto();
		User.book(a);
		break;
		case 'C':Sedan h=new Sedan();
		User.book(h);
		break;
		default:System.out.println("WRONG INPUT");
		}
		s.close();
	}
	
	public static void book(Ola ad)
	{
		ad.ride();
		if(ad instanceof Mini)
		{
			Mini x=(Mini)ad;
			x.costM();
		}
		else if(ad instanceof Auto)
		{
			Auto y=(Auto)ad;
			y.costA();
		}
		else
		{
			Sedan z=(Sedan)ad;
			z.costS();
		}
	}
	

}
