package part3programs;

public class MobileObjCls 
{
	String brand;
	String model;
	String color;
	double price;
	public MobileObjCls(String brand,String model,String color,double price)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	public String toString()
	{
		return brand+"\n"+price+"\n"+model+"\n"+price;
	}
public boolean equals(MobileObjCls c)
{
	if(this.price==c.price)
		return true;
	else
		return false;
}
public static void main(String[] args) {
	MobileObjCls m1=new MobileObjCls("REDMI","NOTE 3","BLUE",65999.50);
	MobileObjCls m2=new MobileObjCls("POCO","X 3","BLACK",65999.50);
	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m1.equals(m2));
	
}
}

