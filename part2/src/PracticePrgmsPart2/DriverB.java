package PracticePrgmsPart2;

public class DriverB {
	public static void main(String[] args) {
		DebitCard d1=new DebitCard(1254045804787896l,4545,369,523.06);
		d1.payment();
		d1.reduceBal();
	}

}
