import java.util.*;
class iterator
{
public static void main(String args[])
{
ArrayList<Integer>al=new ArrayList<Integer>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
al.add(s.nextInt());
}
int k=s.nextInt();
Iterator<Integer>it=al.iterator();
while(it.hasNext())
{
if(it.next()<=k)
it.remove();
}
System.out.println(al);
}
}