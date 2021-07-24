import java.util.*;
public class Main {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<Integer>();
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("maximum element: "+Collections.max(s));
			System.out.println("minimum element: "+Collections.min(s));
		
	}
}