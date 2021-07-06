import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size: ");
			int size=s.nextInt();
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
		}
		System.out.println( "the minimum element is:" +a[0]);
			}
}
//=============================
//enter the array size: 5
//34
//46
//56
//33
//78
//the minimum element is:33
