import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a Line Of Strings : ");
		String x=s.nextLine();
		String ch[]=x.split(" ");
		String o="";
		int l=ch.length;
		String p[]=new String[l];
		for(int i=0;i<l;i++){
			int m=ch[i].length();
			for(int j=m-1;j>=0;j--){
				o+=ch[i].charAt(j);
				p[i]=o;
			}
			o="";
		}
		System.out.println("after Reversing : ");
		for(int i=0;i<l;i++)
			System.out.print(p[i]+" ");
	}
}