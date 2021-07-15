import java.util.*; 
class twinprime
{
static void twinprime(int n,int m) {
int c[]=new int[m+1-n+1];
int k=0;
int cnt=0;
 for(int i=n;i<=m;i++){
 	int count =0;
 	for(int j=2;j<i;j++){	
 		if(i%j==0)
 			count++; }
 		 if(count==0){
        c[k]=i;
        k++;
 		 }}
 		 for(int i=0;i<c.length-1;i++)
 		 {
 		  if(c[i+1]-c[i]==2)
 		  {	cnt++;
 		  }
 		 }
 		 System.out.print("the number of twinprime count is: "+cnt);
}
public static void main(String args[]) 
 		 { 
 		 Scanner sc=new Scanner(System.in); System.out.print("enter any number: "); 
 		 int n=sc.nextInt(); 
 		 System.out.print("enter any number: "); 
 		 int m=sc.nextInt();	 
 		 twinprime(n,m);		 	 
 		}
 }