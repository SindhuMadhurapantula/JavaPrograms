import java.util.*;
public class fact{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int fact=1;
		int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
		fact=1;
		while (a[i]>=1)
		{
			 fact=a[i]*fact;
			 a[i]--;
		}
		System.out.println("factorial : " +fact);
}
	}
}