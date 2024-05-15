package polymorphismPrograms;

public class CreditCard extends Card
{
	public void payment()
	{
	 System.out.println("Payment Done by Credit Card");
	}
    public void reduceLimit()
    {
    	System.out.println("Credit limit reduced");
    }
}
