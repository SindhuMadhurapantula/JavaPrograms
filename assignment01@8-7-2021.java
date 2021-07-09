import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int cnt=0,c=0;
		System.out.print("enter number of columns and rows: ");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j&&a[i][j]!=0)
				{
					cnt++;
				}
				if(i==j&&a[i][j]!=0)
				{
				    c++;
				}
			}}
			if(cnt==0&&c==n)			
						System.out.println("it is  a diagonal matrix");
			else
	System.out.println("it is not a diagonal matrix");
	}}