import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size: ");
		int n=s.nextInt();
		System.out.print("enter number of right rotations: ");
		int x=s.nextInt();
	System.out.print("enter number of left rotations: ");
		int y=s.nextInt();
		int d=0;
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.println("enter array elements");	
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=n-x;i<=n-1;i++)
		{
			b[d]=a[i];
			d++;
		}
		for(int i=0;i<n-x;i++)
	{
		b[x+i]=a[i];
	}
		for(int i=0;i<n;i++) {
			 if((i-y)<0) {
			 	 c[n+i-y]=b[i];
			 }
			 else c[i-y]=b[i];
		}
		for(int i=0;i<n;i++)
			System.out.print(c[i]+" "); 
	}
}