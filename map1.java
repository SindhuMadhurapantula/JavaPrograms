import java.util.*;
class map1
{
public static void main(String args[])
{
HashMap<String,Integer>h=new HashMap<String,Integer>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
for(int i=0;i<n;i++)
{
String key=a[i];
if(h.containsKey(key))
h.put(key,h.get(key)+1);
else
h.put(key,1);
}
for (Map.Entry<String,Integer>i:h.entrySet())
{
if (i.getValue()>2)
System.out.print(i.getKey()+"--->"+i.getValue() );
}
}
}
