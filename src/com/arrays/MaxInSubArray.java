package com.arrays;

public class MaxInSubArray {
	
	
	public static void main(String argsp[]){
		
		int arr[]={1,3,-4,8,2,-3};
		System.out.println(maxSubArray(arr));
		
	}
	
	
	  public static int maxSubArray(int[] A) {
	       int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           max= Math.max(max, newsum);
	       }
	       return max;
	    }

}
