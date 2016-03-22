package com.lafore.queue;

/**
 * 
 * How to create queue with no itemcount.
 * 
 * what is needed to perform isFull and isEmptly 
 * always create queue with maxsize bigger by one .
 * 
 * In a circular queue rear can be at same position with front when it is full 
 * and empty so the distinction will happen at computation of isFull or isEmpty.
 * 
 *  Always check for isFull while inserting and isEmpty while removing items.
 *  The idea is not to let the queue become circular.
 * 
 * 
 * @author dheeraj
 *
 */



public class QueueX {
	
	
	int maxSize;
	int rear;
	int front;
	
	long queueArray[];
	
	public QueueX(int size){
		this.maxSize=size+1;
		queueArray = new long[maxSize];
		rear=-1;
		front=0;		
	}
	
	public void insert(long l){
		if(rear==maxSize-1){
			rear=-1;
		}
		queueArray[++rear]=l;
	}
	
	public long remove(){
		long temp = queueArray[front++];
		if(front == maxSize){
			front=0;
		}
		return temp;
	}
	
	public long peek(){
		return queueArray[front];
	}
	
	public boolean isFull()
	// true if queue is full
	{
		return ( rear+2==front || (front+maxSize-2==rear) );
	}
	
	public boolean isEmpty()
	// true if queue is empty
	{
		return ( rear+1==front || (front+maxSize-1==rear) );
	}
	public int size()
	// (assumes queue not empty)
	{
		if(rear >= front)
		// contiguous sequence
		return rear-front+1;
		else
		// broken sequence
		return (maxSize-front) + (rear+1);
	}
	
	
	public static void main(String args[]){
		int queueSize=10;
		int totalData = 10;
		
		QueueX queue = new QueueX(queueSize);
		int j=0;
		for(j=0;j<totalData;j++){
			if(!queue.isFull())
			queue.insert((long)Math.random()*j);
		}
		System.out.println(" Is queue full  - "+queue.isFull());
		queue.insert((long)Math.random()*j);
		System.out.println("Queue size - "+queue.size());
		System.out.println(" Is queue full  - "+queue.isFull());
		System.out.println(" Is queue emptly - "+queue.isEmpty());
	}
}




