package com.sedgewick.sort;

import static com.sedgewick.sort.SortUtil.*;

public class Selection
{
	public static void sort(Comparable[] a)
	{ // Sort a[] into increasing order.
		int N = a.length;
		// array length
		for (int i = 0; i < N; i++)
		{ // Exchange a[i] with smallest entry in a[i+1...N).
			int min = i;
			// index of minimal entr.
			for (int j = i+1; j < N; j++)
			if (less(a[j], a[min])) min = j;
			exch(a, i, min);
		}
	}
	
	public static void main(String args[]){
		Long d[] = new Long[50000];
		for(int i = 0;i<d.length;i++)
		d[i] = (Math.round(Math.random()*15));
		
//		System.out.println("Before sorting ");
//		show(d);
//		System.out.println("after sorting");
//		sort(d);
//		show(d);
		
		long startTime = System.currentTimeMillis();
		long startMem = Runtime.getRuntime().freeMemory();
		sort(d);
		long endTime = System.currentTimeMillis();
		 long endMem = Runtime.getRuntime().freeMemory();
		 System.out.println((endTime - startTime)+"  "+(startMem-endMem));
		
	}
// See page 245 for less(), exch(), isSorted(), and main().
}