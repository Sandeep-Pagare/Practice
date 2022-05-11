package com.array;

public class LeftShift {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int n=2;
		for(int i=0; i<n; i++)
		{
			int j, first;
			first = a[0];
			for(j=0; j<a.length-1; j++)
			{
				a[j]=a[j+1]; 
			}
			a[j]=first;
		}
		System.out.println("Output ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
