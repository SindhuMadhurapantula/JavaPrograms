import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		System.out.println("Values Before Swapping\n"+"First Value = "+a+"\nSecond Value ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values After Swapping\n"+"First Value = "+a+"\nSecond Value ="+b);
		
		
	}
}