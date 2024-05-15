package part3programs;

public class VowelFirstEx {
public static void main(String[] args) {
	String m="ABCDEF";
	String r="";
	String i="";
	for(int d=0;d<m.length();d++)
	{
		char u=m.charAt(d);
		switch(u)
		{
		case 'A','E','I','O','U','a','e','i','o','u': r=r+u;
		break;
	    default:i=i+u;
		}
//		if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
//		{
//			r=r+u;
//		}
//		else
//		{
//			i=i+u;
//		}
	}
		System.out.println(r+i);
	}
	
}

