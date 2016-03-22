package com.lafore.sort;

public class ArrayOp {
		
		private long [] arr;
		private int nElmen;
		
		ArrayOp(int max){
			arr = new long[max]; 
		}
		
		public void insert(int num){
		arr[nElmen++] = num;
		}
		
		public void display(){
			for(int l=0;l<nElmen;l++)
				System.out.print(arr[l]);
			System.out.println();
		}
		
	
		public void selectionSort(){
		int min , out , in;
			for (out=0;out<nElmen-1;out++){
				min = out;
				for(in=out+1;in<nElmen;in++){
					if(arr[in]<arr[min])
						min=in;
				}
				if(arr[out]!=arr[min])
				swap(out, min);
			}
		}
		
		int countSwap = 0;
		private void swap(int out, int min){
//			long temp  = arr[out];
//			arr[out] = arr[min];
//			arr[min] = temp; 

//			arr[out] = arr[min]*arr[out];
//			arr[min] = arr[out]/arr[min];
//			arr[out] = arr[out]/arr[min];
			
//			arr[out] = arr[out]+ arr[min];
//			arr[min] = arr[out]- arr[min];
//			arr[out] = arr[out]- arr[min];			
			

			
			arr[out] = arr[out]^ arr[min];    // same as a+b
			arr[min] = arr[out]^ arr[min];    // same as a -b
			arr[out] = arr[out]^ arr[min];    // same as  a- b
			//countSwap++;
		}
		
		public void insertionSort()
		{
				int in, out;
				for(out=1; out<nElmen; out++) // out is dividing line
				{
					long temp = arr[out]; // remove marked item
					in = out; // start shifts at out
						while(in>0 && arr[in-1] >= temp) // until one is smaller,
						{
							arr[in] = arr[in-1]; // shift item to right
							--in; // go left one position
							display();
						}
						arr[in] = temp; // insert marked item
				} // end for
		} // end insertionSort()
		
		
		
			

		
}
