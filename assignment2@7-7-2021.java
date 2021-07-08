import java.util.*;
  class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner( System.in);
    	System.out.print("enter an array size: ");
		int n=s.nextInt();
		int a[]=new int[n];
		int pc=0;
		int sum=0;
		int cnt=0;
		System.out.println("enter array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					cnt++;
					}
			}
				if(cnt==1){
						++pc;
						}
				cnt=0;
		}			
	System.out.println("the total number of prime numbers in the given array is: "+pc);
	}}