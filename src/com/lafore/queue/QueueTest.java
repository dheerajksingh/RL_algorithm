package com.lafore.queue;

public class QueueTest {
	
	int maxsize;
	long [] array ;
	int rear=-1,front=0;
	
	QueueTest(int size){
		maxsize = size;
		array=new long[maxsize];
	}
	
	public void insert(long data){
		if(rear==maxsize-1){
			rear = -1;
		}
		array[++rear] = data;
	}
	
	public long remove(){
		long temp = array[front++];
		if(front==maxsize)
			front=0;
		return temp;
	}
	
	public int size(){
		if(rear>=front){
			return rear-front+1; // one is added coz front is also counted
		}
		else{
			return maxsize-front +rear+1;  // one is added coz the index 0 is not calculated
		}
	}
	
	public boolean isEmpty(){
		return (front-rear)==1 || front +maxsize-1 == rear;
	}
	
	public boolean isFull(){
		if(rear>front){
			return (rear-front == maxsize-1);
		}else if(rear<front){
			return (rear ==-1 && front==0?false :(front-rear==1));
		}else return false;
	}
	public static void main(String args[]){
		
		QueueTest qtest = new QueueTest(5);
		System.out.println(qtest.isFull());

		qtest.insert(1);
		qtest.insert(2);
		qtest.insert(3);
		qtest.insert(4);
		System.out.println(qtest.isFull());

		qtest.insert(5);
		System.out.println(qtest.isFull());
		qtest.remove();
		System.out.println(qtest.isFull());
		qtest.insert(6);
		System.out.println(qtest.isFull());



	}

}
