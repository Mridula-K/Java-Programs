package interfacePrgms;

import java.util.Scanner;

public class DeviceUser 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	boolean p;
	do
	{
	System.out.println("ENTER 1 FOR BULB");
	System.out.println("ENTER 2 FOR IRONBOX");
	int r=s.nextInt();
	switch(r)
	{
	case 1:Bulb b=new Bulb();
	connect(b);//classname.methodname() is not required ,as it is in same class we can just use method.
	break;
	case 2:IronBox i=new IronBox();
	connect(i);
	break;
	default:System.out.println("WRONG INPUT");
	break;
	}
	System.out.println("enter true to continue");
	p=s.nextBoolean();
	}
	while(p);
	s.close();
	}
	public static void connect(ESwitch e)
	{
	e.switchOn();
	e.switchOff();

	}

}
