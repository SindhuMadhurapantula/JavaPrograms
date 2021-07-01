import java.util.*;
public class Main {
	public static void main(String[] args) {
			System.out.print("enter a number:");Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for (int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

//==================================
//OUTPUT:
//enter a number:5
//*****
//****
//***
//**
//*
