import java.util.*;
public  class string 
{
	static void method(String s)
	{
	char c[]=s.toCharArray();	
		int n=s.length();
    	int k=0;
	for (int i=0;i<n;i++)
	{
   	char ch[]=new char[5];
		if(c.charAt(i)==c.charAt(i+1))	
			{	k++;}
		 i=0;
		ch.charAt(i)=c.charAt(i);
		i++;
		ch.charAt(i)=(k);
		k=0;
	}
		for (int i=0;i<ch.length;i++)
	{
		System.out.print(ch);
	}
	int p=ch.length;
		System.out.print(p);
	}
	public static void main(String[] args)
	 {
	Scanner sc=new Scanner (System.in);
	System.out.print("enter a string");
	String s=sc.next();	
	method(s);	
	}
}