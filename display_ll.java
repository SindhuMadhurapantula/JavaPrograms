import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<Integer>a=new LinkedList<Integer>();
		System.out.print("enter a number: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(s.nextInt());
		}
		System.out.println("the linkedlist is: ");
		for(Integer i:a)
		{
			System.out.println(i);
		}
	}}