import java.util.*;
public class Main {
	public static void main(String[] args) {
		char c ='A';
		System.out.print("enter a number:");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
			for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
		System.out.println(" ");
		}
	}
}

//================================
//OUTPUT:
//enter a number:5
//A
//BC
//DEF
//GHIJ
//KLMNO
