package com.recursion;

public class TriangularNumber {
	
	public static void main(String args[]){
		int tSize=100000;
		long time1 = System.currentTimeMillis();
		System.out.print(triangularNumber(tSize ));
		long time11 = System.currentTimeMillis();
		System.out.println(" total time -- "+(time11-time1));
		
		long time2 = System.currentTimeMillis();
		System.out.print(triangularNumber1(tSize));
		long time22 = System.currentTimeMillis();
		System.out.println(" total time -- "+(time22-time2));
		
		long time3 = System.currentTimeMillis();
		System.out.print(recursionTriangularNumber(tSize));
		long time33 = System.currentTimeMillis();
		System.out.println(" total time -- "+(time33-time3));
	}
	
	
	/// my logic 
	public static int triangularNumber(int n){
		int prev=0;
		int j=0;
		for(j=1;j<n;j++){
			prev=prev+j;
		}
		return prev+j;
	}
	
	// looking at the number as a triangle
	public static int triangularNumber1(int n){
		int total=0;
		while(n>0){
			total=total+n;
			--n;
		}
		return total;
	}
	
	// using recursion to find the number 
	public static long recursionTriangularNumber(long n)
	{
		if(n==1){
		 return 1;	
		}
		else{
			return n+recursionTriangularNumber(n-1);
		}
		
	}
			
}
