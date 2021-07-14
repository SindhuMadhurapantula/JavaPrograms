import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
System.out.print("enter Q value: ");
		int Q=sc.nextInt();
		StringBuilder sb=new StringBuilder(str);		for (int i=0;i<Q;i++){
		int ind=sc.nextInt();
	sb.deleteCharAt(ind);
	String a=sc.next();
	sb=sb.replace( ind,ind,a);}
		StringBuilder sa=new StringBuilder(sb);
	System.out.print("enter munber of M operations: ");
	char b,a;
	int M=sc.nextInt();
		for (int i=0;i<M;i++){
		int k=sc.nextInt();
		int l=sc.nextInt();
		a=sa.charAt(k);
		 b=sa.charAt(l);
	     sa.deleteCharAt(k);
     	sa.deleteCharAt(l-1);
		sa=sa.insert(l-1,a);
		sa=sa.insert(k,b);	}
	int e=sa.length();
	int d=sb.length();				
		int cnt=0;
	for(int k=0;k<d;k++){
							if(sb.charAt(k)==sa.charAt(k))
				{
				cnt++;
				}}
		System.out.println(sb);
		System.out.println(sa);
		System.out.println(cnt);
	}}