import java.util.*;
public class Main {
			public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string: ");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		String lp="";
		String rp="";
		StringBuilder lp1=new StringBuilder(" ");
		StringBuilder rp1=new StringBuilder(" ");		StringBuilder a=new StringBuilder("");
		int n=sb.length();
		int m=n/2;
		for(int i=0;i<m;i++)
		{
			lp+=sb.charAt(i);
		}
			lp1.append(lp);
		for(int i=m;i<n;i++)
		{
			rp+=sb.charAt(i);
		}
			rp1.append(rp);
		a=a.append(rp1);
   	a=a.append(lp1);
    	a.deleteCharAt(m+1);
		int p=a.length();
		for(int i=0;i<p;i++){
			int k=p/2;
			if(a.charAt(k)==a.charAt(k+1));
			a.deleteCharAt(k);
			p--;	}
		System.out.print("the minimized String is: "+a);
		}}