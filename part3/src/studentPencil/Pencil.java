package studentPencil;

public class Pencil
{
int price;
String colour;
public Pencil(int price, String colour) 
{
	
	this.price = price;
	this.colour = colour;
}
public String toString()
{
	return "Pencil colour is "+colour+"\n"+"Price of the pencil is "+price;
}

}
