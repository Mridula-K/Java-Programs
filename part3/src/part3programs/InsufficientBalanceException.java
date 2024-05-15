package part3programs;

public class InsufficientBalanceException extends RuntimeException
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InsufficientBalanceException(String b)
{
super(b);	
}
}
