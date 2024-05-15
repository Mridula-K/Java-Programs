package part3programs;

public class Emp 
{
String eName;
float sal;
public Emp(String eName,float sal)
{
	this.eName=eName;
	this.sal=sal;
}
public void details()
{
	System.out.println("Employee name is "+eName);
	System.out.println("Sal is "+sal);
}
public static void main(String[] args)
{
Emp e1=new Emp("Ram",10000);
Emp e2=new Emp("Shiva",15000.50f);
Emp e3=new Emp("Vishnu",20000f);
Emp e4=new Emp("Sai",50000.50f);
Emp e5=new Emp("Hanuman",45192.46f);
Emp f[]={e1,e2,e3,e4,e5};
System.out.println("THE DETAILS OF THE EMPLOYEES EARNING SALARY MORE THAN 40000 IS AS FOLLOWS:");
for(int i = 0;i<f.length;i++)
{
	if( f[i].sal>40000)
	{
		f[i].details();
	}
}

}
}
