package card;

public class CreditCard extends Card
{
public void payment()
{
	System.out.println("Using Credit Card");
}
public void reduceLimit()
{
	System.out.println("Reducing Limit as payment made");
}
}
