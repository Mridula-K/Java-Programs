package vehicleEx;

public class Bike extends Vehicle
{
String brand;
public Bike(String brand) {
	super();
	this.brand = brand;
}

public void ride()
{
	
}
public String toString()
{
	return "The Brand of Bike is "+brand+" ";
}
}
