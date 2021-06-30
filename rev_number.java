import java.util.*;
public class Main {
	public static void main(String[] args) {
	System.out.println("enter a number");
			Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		
		int r=0;
		while(n<0||n>0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
			System.out.print("the reversed number is:"+r);
		}}
//		enter a number
//12344
//the reversed number is:44321
