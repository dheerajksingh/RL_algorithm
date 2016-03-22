package com.lafore.stack;

public class StackX {

	private int top;
	private int maxSize=0;
	private char stackArray[]; 
	
	public StackX(int size){
		maxSize=size;
		stackArray = new char[maxSize];
		top=-1;
	}
	
	public long pop(){
		return stackArray[top--];

	}
	
	public void push(char j){
		
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
