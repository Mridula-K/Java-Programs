package part3programs;

public class SplitEx {
public static void main(String[] args) {
	String h="BENGALURU";
	System.out.println(h);
	String m[]=h.split("GA");
	System.out.println("AFTER SPLITTING");
	for(int i=0;i<m.length;i++)
	{
		System.out.println(m[i]);
	}
}
}
