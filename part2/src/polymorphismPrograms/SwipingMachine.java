package polymorphismPrograms;

public class SwipingMachine 
{
public static void main(String[] args) 
{
DebitCard d=new DebitCard();
SwipingMachine.swipe(d);
CreditCard c=new CreditCard();
SwipingMachine.swipe(c);	
}
public static void swipe(Card l)
{
 l.payment();
 if(l instanceof DebitCard)
 {
 DebitCard e=(DebitCard)l;
 e.reduceBal();
 }
 else
 {
	 CreditCard f=(CreditCard)l;
	 f.reduceLimit();
 }
 
	
}
}

