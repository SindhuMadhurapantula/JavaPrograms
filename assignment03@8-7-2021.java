import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size: ");
		int n=s.nextInt();
		int d=n-1;
		int m=0,k=0;
		int a[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
				if(a[d]==9){
			    	a[d]=0;
			    	d--;			    	
			        k=a[d];
			    	a[d]=++k;
				}
				else{	
	            	m=a[d];		
					a[d]=++m;}
			for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		
	}
}