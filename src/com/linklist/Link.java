package com.linklist;

import java.util.HashMap;

public class Link {
	public int i;
	public double d;
	
	HashMap h  = new HashMap();
	
	Link next;
	public Link(int i , double d){
		this.i=i;
		this.d=d;
	}
	
	public void displayLink(){
		System.out.println("{"+i+" ,"+d+"}");
	}
}
