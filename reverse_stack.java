import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the String : ");
		String y=s.next();
		char ch[]=y.toCharArray();
		Stack <Character>x=new Stack <Character>();
		for(char i:ch)
			x.push(i);
		System.out.print("reverse string: ");
		for(int i=0;i<ch.length;i++)
			System.out.print(x.pop());
	}
}