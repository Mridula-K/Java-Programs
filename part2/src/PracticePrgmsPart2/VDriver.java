package PracticePrgmsPart2;

import java.util.Scanner;

public class VDriver 
{
	static int vn,cn,bn;
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		
		boolean r;
		do
		{
	
		System.out.println("ENTER 1 FOR BIKE");
		System.out.println("ENTER 2 FOR CAR");
		int u=s.nextInt();
		switch(u)
		{
		case 1:Bike b=new Bike();
		VDriver.register(b);
		break;
		case 2:Car c=new Car();
		VDriver.register(c);
		break;
		default:System.out.println("WRONG INPUT");
		
		}
		System.out.println("Enter true to repeat,enter fase to exit");
		r=s.nextBoolean();
	
     
		
	}
		while(r);
		System.out.println("NUMBER OF VEHICLE IS "+vn);
	     System.out.println("NUMBER OF BIKE IS "+bn);
	     System.out.println("NUMBER OF CAR IS "+cn);
	     s.close();
	}
		
	public static void register(Vehicle ob)
	{
	ob.details();
		if(ob instanceof Bike)
		{
			bn++;
			vn++;
		}
		else
		{
			cn++;
			vn++;
		}
     }
	
	}

