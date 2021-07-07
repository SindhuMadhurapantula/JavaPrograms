import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size: ");
			int size=s.nextInt();
			int k=0;
		int a[]=new int [size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if (a[0]>a[i])
			{
				a[0]=a[i];
			}
			if (a[0]<a[i])
			{
			 k=a[i];
			}
		}
		System.out.println("minimum and maximum numbers are: " +a[0]+" "+k);
	}
}