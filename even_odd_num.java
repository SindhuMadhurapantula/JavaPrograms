
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String even="";
		String odd="";
			for(int i=0;i<a.length();i++){
			int x =a.charAt(i);
			if(x%2==0)
			even+=a.charAt(i);
			else
			odd+=a.charAt(i);
	}
		System.out.println(even+" "+odd);
	}}
//12345
//24  135