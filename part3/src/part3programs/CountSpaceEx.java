package part3programs;

public class CountSpaceEx 
{

public static void main(String[] args) {
	int l;
	int y=0;
	String f=" AB CD";
	for(int j = 0;j<f.length();j++)
	{
		char p=f.charAt(j);
        l = (int)p;
        switch(l)
        {
        case(32):y++;
        default:
        }
//        if(l==32)
//        {
//        	y++;
//        }
	}
	System.out.println(y+" "+"Spaces are there");
	}
}
