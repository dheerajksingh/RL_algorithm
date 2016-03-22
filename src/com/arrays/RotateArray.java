package com.arrays;

public class RotateArray {

	
	public static void main(String args[]){
		int i []={1,5,42,34,32,3,4,5};
		i = rotate(i,2);
		for(int j =0;j<i.length;j++) {
			System.out.println(i[j]);
		}
	}
	
	// at same array --
	public static int[] rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		return arr;
	}
}
