package PracticePrgmsPart2;

public class DriverIB 
{
public static void main(String[] args) {
	ATM a=new Axis1();
	a.checkBal();
	a.print();
	a.withdrawMoney();
Rbi1 r=(Rbi1)a;
r.printInterest();
r.print();


}
}
