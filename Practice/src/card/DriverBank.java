package card;

import java.util.Scanner;

public class DriverBank 
{
public static void main(String[] args) 
{
	Scanner m=new Scanner(System.in);
	boolean l;
	do
	{
	System.out.println("Enter 1 for DebitCard and Enter 2 for CreditCard");
	int h=m.nextInt();
	if(h==1)
	{
		DebitCard d=new DebitCard();
		DriverBank.swipe(d);
	}
	else if(h==2)
	{
		CreditCard c=new CreditCard();
		DriverBank.swipe(c);
	}
	System.out.println("Enter true if you want to repeat");
	l=m.nextBoolean();
	}
	while(l);
	m.close();
	
}
public static void swipe(Card f)
{
	f.payment();
	if(f instanceof DebitCard)
	{
		DebitCard w=(DebitCard)f;
		w.reduceBal();
	}
	else
	{
		CreditCard x=(CreditCard)f;
		x.reduceLimit();
	}
}
}
