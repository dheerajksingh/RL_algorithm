package com.lafore.stack;

public class StackXLong {

	private int top = -1;
	private int maxSize=0;
	private long stackArray[]; 
	
	public StackXLong(int size){
		maxSize=size;
		stackArray = new long[maxSize];
	}
	
	public long pop(){
		return stackArray[top--];

	}
	
	public void push(long j){
		
		stackArray[++top] = j;
	}
	
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
}
