import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("enter a number");
		int n=s.nextInt();
			int rem=0;
			int add=0;
			int mul=1;
			do
			{
			rem=n%10;
			add=add+rem;
			mul=mul*rem;
			n=n/10;
			}while(n>=1);
			int k=mul-add;
			System.out.println(k);
	}}

//enter a number
//256
//47