import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size");
		int n=s.nextInt();
		System.out.println("enter number of rotations");
		int r=s.nextInt();
		int d=0;
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("enter array elements");	
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=n-r;i<=n-1;i++)
		{
			b[d]=a[i];
			d++;
		}
		for(int i=0;i<n-r;i++)
	{
		b[r+i]=a[i];
	}
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+b[i]);
		}
}}