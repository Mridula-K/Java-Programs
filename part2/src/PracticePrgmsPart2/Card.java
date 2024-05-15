package PracticePrgmsPart2;

public class Card
{
long cardno;
int pin;
int cvv;
public Card(long cardno,int pin,int cvv)
{
	this.cardno=cardno;
	this.pin=pin;
	this.cvv=cvv;
	
}
public void payment()
{
	System.out.println("PAYMENT MADE");
}
}
