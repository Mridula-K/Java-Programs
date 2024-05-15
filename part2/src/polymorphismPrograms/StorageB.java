package polymorphismPrograms;

import java.util.Scanner;

public class StorageB
{ 
	static int pn,nn,bn;
	public static void main(String[] args)
	{

	Scanner u=new Scanner(System.in);
	boolean f;
	do
	{
		System.out.println("Enter 1 to Puma or Enter 2 for Nike");
		int y=u.nextInt();
		switch(y)
		{
		case 1:Puma  p=new Puma();
		StorageB.add(p);
		break;
		case 2: Nike n=new Nike();
		StorageB.add(n);
		break;
		default:System.out.println("Wrong Input Given");
		}//switch ends
	System.out.println("Enter true to repeat the menu or Enter false to exit");
	f=u.nextBoolean();
	}
	
	while(f);
	 System.out.println("NUMBER OF PUMA : " + pn);
	 System.out.println("NUMBER OF NIKE : " + nn);
	 System.out.println("TOTAL BRANDS : "+ bn);
	
	 if(pn>nn)
	 {
		 System.out.println("Puma is more");
	 }
	 else if(pn==nn)
	 {
		 System.out.println("Both are equal");
	 }
	 else
	 {
		 System.out.println("Nike is more");
	 }
	 u.close();
	 }//main ends

public static void add(Brand ob)//up casting
    {
	ob.display();
	if (ob instanceof Puma)
	{
		pn++;
		bn++;
	}
	else
	{
		nn++;
		bn++;
	}
    
	
}//add ends
}
