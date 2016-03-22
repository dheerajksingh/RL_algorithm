package com.lafore.queue;

import java.util.Hashtable;

public class QueueApp {
	
	
	public static void main(String args[]){
	int bitmask = 0x000F;
	System.out.println("bitmask "+bitmask);
    int val = 0x2222;

	System.out.println("val "+val);

    // prints "2"
    System.out.println(val & bitmask);
	}
}
