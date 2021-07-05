import java.util.*;
public class Main {
	public static void main(String[] args) {
	   	System.out.print("enter a number:");Scanner s =new Scanner(System.in);
		int n=s.nextInt();
	   for(int i=1;i<=n;i++)
	   {
	   	for(int j=1;j<=(2*i)-1;j++)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println();
	   }
	   for(int k=1;k<n;k++)
	   {
	   	for(int l=1;l<=2*(n-k)-1;l++)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println();
	   }}
}
//==============================
//enter a number:4
//*
//***
//*****
//*******
//*****
//***
//*
