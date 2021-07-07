import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size: ");
			int size=s.nextInt();
		int a[]=new int [size];
		int b[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			b[j]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if (a[0]>a[i])
			{
				a[0]=a[i];
			}
		}
		for(int j=0;j<size;j++)
		{
			if (b[0]<b[j])
			{
				b[0]=b[j];
			}
		}
		System.out.println("product of two numbers "+(a[0]*b[0]));
	}}