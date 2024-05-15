package PracticePrgmsPart2;


public class DriverCard3
{
	public static void main(String[] args)
	{
	 DebitCard3 d1=new DebitCard3();
	 DriverCard3.swipe(d1);
	 CreditCard3 c1=new CreditCard3();
	 DriverCard3.swipe(c1);	
	}

	public static void swipe(Card3 k) 
	{
	k.payment();
	if(k instanceof DebitCard3)
	{
		DebitCard3 o=(DebitCard3)k;
		o.reduceBal();
	}
	else
	{
		CreditCard3 p=(CreditCard3)k;
		p.reduceLimit();
	}
		
	}

}
