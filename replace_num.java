import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
    	System.out.println("enter a number");
		String n=s.next();
		String x=s.next();
		String y=s.next();
		for(int i=0;i<n.length();i++)
		{
        n=n.replace(x,y);
			}
		System.out.print("replaced number is:"+n);	
	}
}

//enter a number
//222344455667
//2
//9
//replaced number is:999344455667