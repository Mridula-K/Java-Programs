package vehicleEx;

public class Car extends Vehicle
{
	String brand;
	public Car(String brand)
	{
		super();
		this.brand = brand;
	}

	public void ride()
	{
		
	}
	public String toString()
	{
		return "The Brand of Car is "+brand+" ";
	}
}
