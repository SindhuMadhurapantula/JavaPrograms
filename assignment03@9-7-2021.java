import java.util.*;
public class Main {
	public static void main(String[] args) 
	{
		String a,b;
 Scanner s=new Scanner(System.in);
 System.out.print("enter string : " );
 a=s.next();
 b=a;
 int k=0;
 int n=a.length();
 char c[]=a.toCharArray();
 char d[]=b.toCharArray();
 for(int i=0;i<n;i++)
 {
 	if(d[i]==c[n-1-i])
 	{
 		k++;
 	}}
 if(k==n)
 	System.out.println("palindrome");
 else
System.out.println(" not palindrome");
	}
}