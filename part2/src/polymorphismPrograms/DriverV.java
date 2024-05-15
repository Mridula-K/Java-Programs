package polymorphismPrograms;

import java.util.Scanner;

public class DriverV 
{
	;
	static int vn,bn,cn;
	
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		boolean h;
		do
		{
			System.out.println("Enter 1 for Bike or Enter 2 for Car");
			int g=o.nextInt();
			switch(g)
			{
			case 1:Bike b=new Bike();
			DriverV.register(b);
			break;
			case 2:Car c=new Car();
			DriverV.register(c);
			break;
			default:System.out.println("Invalid Input");
			}
System.out.println("Enter true to repeat menu or Enter false to exit");
h=o.nextBoolean();
		}
		while(h);
			System.out.println("Number of bikes : "+bn);
		    System.out.println("Number of car : "+cn);
		    System.out.println("Total Number of Vehicle : "+vn);
		o.close();
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
