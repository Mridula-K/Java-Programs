package Assignment;

public class Pen
{
String brand;
double price;
String color;

public Pen(String brand, double price, String color) {
	super();
	this.brand = brand;
	this.price = price;
	this.color = color;
}
public String toString()
{
	return brand+" "+price+" "+color;
}

}
