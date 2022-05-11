package com.array;

public class Decending {

	public static void main(String[] args) {
		int a[] = {10,20,20,50,60,20,30,60,90};
		int large=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					large = a[i];
					a[i]=a[j];
					a[j]=large;
				}
			}
				
		}
		
			System.out.println(a[a.length-3]);
		
	}
}
