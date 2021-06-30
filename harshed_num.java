import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
				System.out.println("enter a number");
		int n=s.nextInt();
			int r=0;
			int m=n;
			int a=0;
			while(n>=1)
			{
			r=n%10;
			a=a+r;
			n=n/10;
			}
			if(m%a==0)
		     System.out.println("it is a harshed number");
		     else
		    	System.out.println("it is  not a harshed number");
	}
}


//enter a number
//245
//it is  not a harshed number
