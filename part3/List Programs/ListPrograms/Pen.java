package ListPrograms;

import java.util.ArrayList;

public class Pen
{
    String brand;
    float price;
public Pen(String brand, float price) 
{
	super();
	this.brand = brand;
	this.price = price;
}
public void display()
{
	System.out.println("The brand is "+brand + " and the price is "+price);
}
public static void main(String[] args) 
{
	
	ArrayList<Pen> p=new ArrayList<Pen>();
	Pen p1=new Pen("Trimax",45f);
	p.add(p1);
	Pen p2=new Pen("Parker",70f);
	p.add(p2);
	Pen p3=new Pen("Reynolds Brite",10f);
	p.add(p3);
	Pen p4=new Pen("Rorito",5f);
	p.add(p4);
	Pen p5=new Pen("Camlin",50f);
	p.add(p5);
	System.out.println("The pens below Rs.50.00,as follows:");
	System.out.println("------------------------------------");
	for(Pen i:p)
	if(i.price<50)
	{
		i.display();
	}
	
}
}
