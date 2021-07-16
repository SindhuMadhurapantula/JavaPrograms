import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer>a=new  ArrayList<Integer>();
		ArrayList<Integer>b=new  ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(2);
		a.add(7);
	int n=a.size();
	for(int i=0;i<n;i++)
	{
		if((a.get(i))%2==0&&i%2==0)
			b.add(a.get(i));
			else if((a.get(i))%2==1&&i%2==1)
    b.add(a.get(i));
	}
	System.out.print(b);
	}}
