import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to check even or odd : ");
		int n=s.nextInt();
		if((n&1)!=0)
		{
			System.out.println(n+" is Odd Number");
		}
		else
		{
			System.out.println(n+ " is Even Number");
		}
	}
}