import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int n=N;
		N=N*N;
		int rem=N%100;
		if(rem==n)
		{
			System.out.println("it is an automorphic number");
		}
		else
		{
				System.out.println("it is not an automorphic number");
	}
	}
}
//=================================
//76
//it is an automorphic number
