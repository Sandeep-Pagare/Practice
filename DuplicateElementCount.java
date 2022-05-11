package com.array;

public class DuplicateElementCount {

	public static void main(String[] args) {
		int a[]= {10,20,20,30,50,50,40,20};
		int b[]= new int[a.length];
		
		int visited= -1;
		for(int i=0; i<a.length; i++)
		{
			int count = 1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited)
			{
				b[i]=count;
			}
		}
		System.out.println("Element | Count ");
		for(int i=0; i<b.length; i++)
		{
			if(b[i]!= visited)
			{
				System.out.println(a[i]+"   "+b[i]);
			}
		}

	}

}
