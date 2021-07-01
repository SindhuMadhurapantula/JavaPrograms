import java.util.*;
public class Main {
	public static void main(String[] args) {
	   	System.out.print("enter a number:");Scanner s =new Scanner(System.in);
		int n=s.nextInt();
	   for(int i=1;i<=n;i++)
	   {
	   	for(int j=1;j<=i;j++)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println();
	   }
	   for(int k=1;k<n;k++)
	   {
	   	for(int l=n-1;l>=k;l--)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println();
	   }
	}
	
}

//================================
//OUTPUT:
//enter a number:5
//*
//**
//***
//****
//*****
//****
//***
//**
//*