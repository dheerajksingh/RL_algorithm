package com.lafore.sort;

class ArraySh
{
	private long[] theArray; // ref to array theArray
	private int nElems; // number of data items
//--------------------------------------------------------------
	public ArraySh(int max) // constructor
	{
		theArray = new long[max]; // create the array
		nElems = 0; // no items yet
	}
//--------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		theArray[nElems] = value; // insert it
		nElems++; // increment size
	}
//--------------------------------------------------------------
	public void display() // displays array contents
	{
		System.out.print("A=");
		for(int j=0; j<nElems; j++) // for each element,
		System.out.print(theArray[j] + " "); // display it
		System.out.println("");
	}
	//--------------------------------------------------------------
	
		
	public void shellSort()
	{
	int inner, outer;
	long temp;
	int h = 1; // find initial value of h
	while(h <= nElems/3)
	h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
	System.out.println(" h   ---  "+h);
	while(h>0) // decreasing h, until h=1
	{
	// h-sort the file
	for(outer=h; outer<nElems; outer++)
	{
		temp = theArray[outer];
		inner = outer;
	// one subpass (eg 0, 4, 8)
		while(inner > h-1 && theArray[inner-h] >= temp)
		{
			System.out.println("****  " +(inner-h)+" *** "+temp+"   outer "+outer);
			theArray[inner] = theArray[inner-h];
			inner -= h;
		}
		theArray[inner] = temp;
		display();
		
	} // end for
	h = (h-1) / 3; // decrease h
	} // end while(h>0)
	} // end shellSort()
	//--------------------------------------------------------------
	} // end class ArraySh
////////////////////////////////////////////////////////////////

public class Shellsort
{
	public static void main(String[] args)
	{
		int maxSize = 13; // array size
		ArraySh arr;
		arr = new ArraySh(maxSize); // create the array

		while(maxSize>0)
			arr.insert(maxSize--);
		
//		for(int j=0; j<maxSize; j++) // fill array with
//		{ // random numbers
//		//long n = (int)(java.lang.Math.random()*99);
//		arr.insert(5);
//		arr.insert(3);
//		arr.insert(7);
//		arr.insert(9);
//		arr.insert(2);
//		}
		arr.display(); // display unsorted array
		arr.shellSort(); // shell sort the array
		arr.display(); // display sorted array
	} // end main()
}


