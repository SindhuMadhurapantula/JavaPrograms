import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of an array : ");
		int size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int cnt=0;
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		for(int k=0;k<size;k++){
			if(a[k]==0){
				b[cnt]=a[k];
				cnt++;
			}
		}
		for(int j=size-1;j>=0;j--){
			if(a[j]!=0){
				b[cnt]=a[j];
				cnt++;
			}
		}
		for(int l=size-1;l>=0;l--){
				System.out.print(b[l]+" ");
		}
	}
}
//========================
//enter the size of an array : 5
//34
//0
//5
//0
//56
//34 5 56 0 0
