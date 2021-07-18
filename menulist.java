import java.util.*;
class listmenu
{
public static void main(String args[])
{
Vector v=new Vector();
v.add(101);
v.add("rama");
v.add(6.58);
v.add(102);
v.add("gita");
v.add(8.98);
System.out.println(v);
v.remove(4);
System.out.println(v+" ");
int k=v.indexOf(6.58);
v.remove(k);
v.add(k,9.17);
System.out.println(v+" ");
System.out.println(v.contains("sita"));
}
}