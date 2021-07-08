import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner s =new Scanner( System.in);
			System.out.print("enter array size: ");
		int n=s.nextInt();
		int a[]=new int[n];
		int ce=0;
		int co=0;
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				ce++;
			}
			else{
				co++;
			}
		}
		if((co*ce)%2==0)
		{
			System.out.println("multiplication of odd count and even count is even");
		}
		else
{
		System.out.println("multiplication of odd count and even count is odd");
}		
	}
}