package com.lafore.sort;

public class SelectionSort {
		
	
	public static void main(String args[]){
		
	 int maxsize=50000;
	 ArrayOp arr = new ArrayOp(maxsize);
	 for(int l=maxsize ;l>0;l--)
	 {
		 arr.insert(l);
	 }
	 
//	 arrSel.display();
	 long startTime = System.currentTimeMillis();
	 //long startMem = Runtime.getRuntime().freeMemory();
	 arr.selectionSort();
	 long endTime = System.currentTimeMillis();
	 System.out.println((endTime - startTime));
	 long endMem = Runtime.getRuntime().freeMemory();
	 //arr.display();

	}

	
	
	
}


