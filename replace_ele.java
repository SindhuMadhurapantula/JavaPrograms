import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>a=new ArrayList<Integer>();
		System.out.print("enter a number: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			a.add(s.nextInt());}
		System.out.print("enter a value to be replaced: ");
		int k=s.nextInt();	
		if(a.contains(k))
		{
			System.out.print("enter value to replace: ");
			int l=s.nextInt();
		    int ind=a.indexOf(k);
	    	a.remove(ind);
			a.add(ind,l);
		}
		else
			System.out.print("element not found.");for(Integer i:a)
			System.out.print(i+" ");		
	}}