package PracticePrgmsPart2;

public class DriverEmp {
	public static void main(String[] args) {
		Employee e1=new Employee(001,563214.23);
		System.out.println(e1.getId());
		e1.setSal(1230145.50);
		System.out.println(e1.getSal());
	}


}
