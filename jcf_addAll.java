import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("red");
		a.add("blue");
		a.add("green");
		a.add("pink");
		System.out.println(" first arraylist is: "+a);
			List<String> b=new ArrayList<String>();
		b.add("white");
	    b.add("yellow");
		b.add("pink");
		System.out.println("the second arraylist is: "+b);
		a.addAll(b);
		System.out.println(" the final arraylist: "+a);
	}
}