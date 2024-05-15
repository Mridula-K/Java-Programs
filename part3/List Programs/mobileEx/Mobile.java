package mobileEx;

public class Mobile 
{
String brand;
float price;
public Mobile(String brand, float price) 
{
	this.brand = brand;
	this.price = price;
}
public String toString()
{
	return "The brand is "+brand+" and the price is "+price;
}
}
