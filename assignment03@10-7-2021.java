import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter choice ");
    	int n=sc.nextInt();
		System.out.print("enter ");
		int s=sc.nextInt();
		String h;
		switch(n)
	{
		case 1:
		h=Integer.toBinaryString(s);
		System.out.print(h);
		break;
		case 2:
		h=Integer.toOctalString(s);
		System.out.print(h);
		break;
		case 3:
	     h=Integer.toHexString(s);
		System.out.print(h);
		break;
	}
		
	
		
	}
}