import java.util.*;
 class Main
 { 
 public static void main(String args[]) { String str;
 int sum=0; 
 Scanner sc=new Scanner(System.in); System.out.print("enter string data: "); str=sc.nextLine(); 
 String ch[]=str.split(" "); 
 int n=ch.length;
 int j=n-1;
 while(j>=0)
 {
 	 String st=ch[j];
 	 int m=st.length();
 	 sum=sum+m;
       j--; 
 }
 	 System.out.print("sum=" + sum); 
 	  } 
}