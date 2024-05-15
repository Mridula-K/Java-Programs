package vehicleEx;

import java.util.ArrayList;

public class Driver
{
	static int bn=0;
	static int cn=0;
	static int vn=0;
public static void main(String[] args) {
	ArrayList<Vehicle> k=new ArrayList<Vehicle>();
	Bike b1=new Bike("Royal Enfield");
	k.add(b1);
	Car c1=new Car("Tesla");
	k.add(c1);
	Bike b2=new Bike("TVS");
	k.add(b2);
	Bike b3=new Bike("R15");
	k.add(b3);
	Car c2=new Car("Audi");
	k.add(c2);
	for(Vehicle i:k)
	{
		if(i instanceof Bike)
		{
			bn++;	
		}
		else
		{
			cn++;
		}
	}
	vn=cn+bn;

	System.out.println("The number of Bikes are "+bn);
	System.out.println("The number of Cars are "+cn);
	System.out.println("The total number of Vehicles are "+vn);
	
	
	
	
	
	
	
}
}
