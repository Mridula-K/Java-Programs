package exam;

public class DriverEmp 
{
	public static void main(String[] args)
	{
		Doctor d=new Doctor();
		DriverEmp.print(d);
		Engineer e= new Engineer();
		DriverEmp.print(e);
		
	}
	public static void print(Employee l)
	{
		l.work();
		if(l instanceof Doctor)
		{
			Doctor u=(Doctor)l;
			u.detailsD();
		}
		else
		{
			Engineer v=(Engineer)l;
			v.detailsE();
		}
	}
	

}
