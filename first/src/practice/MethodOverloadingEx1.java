package practice;

public class MethodOverloadingEx1 {
	public static void main(String[] args) 
	{
		MethodOverloadingEx1.add(12,10);
		MethodOverloadingEx1.add("HI","HELLO");
		MethodOverloadingEx1.add('a','b');
		MethodOverloadingEx1.add("JAVA","MANUAL");
	}
	public static void add(int a,int b)
	{
		
		System.out.println("Integer: "+a+b);
	}
	public static void add(String a,String b)
	{
		
		System.out.println("String: "+a+b);
	}
	public static void add(char a,char b)
	{
		System.out.println("Char: "+a+b);
	}
}
