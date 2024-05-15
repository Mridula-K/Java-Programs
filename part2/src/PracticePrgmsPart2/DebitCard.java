package PracticePrgmsPart2;

public class DebitCard extends Card
{
double bal;

public DebitCard(long cardno,int pin,int cvv,double bal)
{
	super(cardno,pin,cvv);
	this.bal = bal;
}
public void reduceBal()
{
	System.out.println("BALANCE UPDATED");
}



}
