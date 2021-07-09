import java.util.*; 
	class main
 { 
 public static void main(String args[])
  {
  	 String str; 
  	 Scanner sc=new Scanner(System.in); System.out.print("enter string:"); 
  str=sc.next(); 
  int u=0,l=0,d=0,s=0; 
  char c[]=str.toCharArray(); 
  for(int i=0;i<c.length;i++)
   { 
  if(Character.isUpperCase(c[i]))
   u++;
   else if(Character.isLowerCase(c[i]))
    l++;
    else if(Character.isDigit(c[i]))
    d++;
     else 
    s++;
     }
    System.out.println(" upper case letters: " +u + " lower case letters: " + l + " number of digits: " +d + " number of symbols: " +s);
   if(u==l&&l==d&&d==s) 	
   {
   	System.out.println("Yes");
   }
   else
	System.out.println("No");

	}
}