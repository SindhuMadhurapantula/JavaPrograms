import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		if(N%4==0)
		{
			System.out.print(++N);
		}
		else
		{
			System.out.print(--N);
		}
	}
}
//============================
//OUTPUT:
//4
//5