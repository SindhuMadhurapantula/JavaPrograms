import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the number : ");
		int num=sc.nextInt();
		int fact=1;	
	    while (num!=1)
		{			
		fact=num*fact;
		num--;
		}
	System.out.print(fact);		
	}
}