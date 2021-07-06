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
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("the duplicate number:");
					System.out.println(a[i]);
				}
			}
		}
	}}
//================================
//enter the array size: 6
//34
//53
//45
//45
//34
//67
//the duplicate number:34
//the duplicate number:45
