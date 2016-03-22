package com.lafore.sort;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 int maxsize=50000;
//		 ArrayOp arr = new ArrayOp(maxsize);
//		 for(int l=maxsize ;l>0;l--)
//		 {
//			 arr.insert(l);
//		 }
//			 
//		 long startTime = System.currentTimeMillis();
//		 long startMem = Runtime.getRuntime().freeMemory();
//		 arr.insertionSort();
//		 long endTime = System.currentTimeMillis();
//		 long endMem = Runtime.getRuntime().freeMemory();
//		 System.out.println((endTime - startTime)+"  "+(startMem-endMem));
//		 
//		 /// here we are comparing selection vs insertion sort
//		 
//		 arr = new ArrayOp(maxsize);
//		 for(int l=maxsize ;l>0;l--)
//		 {
//			 arr.insert(l);
//		 }
//		 
//		 
//		 
//		  startTime = System.currentTimeMillis();
//		  startMem = Runtime.getRuntime().freeMemory();
//		 arr.selectionSort();
//		 endTime = System.currentTimeMillis();
//		 endMem = Runtime.getRuntime().freeMemory();
//		 System.out.println((endTime - startTime)+"  "+(startMem-endMem));
//	
		
		ArrayOp arr = new ArrayOp(9);
		arr.insert(9);
		arr.insert(8);
		arr.insert(7);
		arr.insert(6);
		arr.insert(5);
		arr.insert(4);
		arr.insert(3);
		arr.insert(2);
		arr.insert(1);
		arr.display();
		arr.insertionSort();
		arr.display();
		
//		ArrayOp arr = new ArrayOp(500000);
//		for(int i = 0;i<10;i++)
//		arr.insert((int)(Math.round(Math.random()*15)));
//		
//		//arr.display();
//		long startTime = System.currentTimeMillis();
//		long startMem = Runtime.getRuntime().freeMemory();
//		arr.insertionSort();
//		long endTime = System.currentTimeMillis();
//		 long endMem = Runtime.getRuntime().freeMemory();
//		 System.out.println((endTime - startTime)+"  "+(startMem-endMem));
		//System.out.println("Sorted  *****************");
		//arr.display();
		
	}

}




