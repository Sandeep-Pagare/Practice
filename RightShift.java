package com.array;

public class RightShift {

	public static void main(String[] args) {
		int a[]= {12,23,4,5,4,7,8};
		int n=2;
		for(int i=0; i<n; i++)
		{
			int j, first;
			first=a[a.length-1];
			//System.out.println(first);
			for(j=a.length-1; j>0; j--)
			{
				a[j] = a[j-1];
			}
			a[j]=first;
		}
		
		  for(int j=0; j<a.length; j++) 
		  { 
			  System.out.print(a[j]+" ");
		  }
		 
	}

}
