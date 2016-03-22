package com.graph;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Graph {
	
	
	 Vertex [] vList = new Vertex[10];
	 int vListCount;
	 int  vMat [][] = new int[10][10];
	
	public void addVertex(char a){
		vList[vListCount++]=new Vertex(a);
	}
	
	void addConnection(int a , int b){
		vMat[a][b]=1;
		vMat[b][a]=1;
	}
	 
	
	private int childUnvisited(int v){
	
		for(int i = 0;i<this.vListCount;i++){
			if(vMat[v][i]==1 && (vList[i]).isVisited==false)
				return i;		
		}
			
			return -1;
	}
	
	private void display(int v){
		System.out.println(" --- "+vList[v].v);
		
	}
	
	public void bfs(){
		Queue<Integer> q = new ArrayBlockingQueue(30);
		
		if(this.vList==null || !(this.vListCount>0)){
			return;
		}
		
		q.offer(0);
		display(0);
		vList[0].isVisited=true;

		
		while(q.size()>0){
			int v = q.poll();	
			int v1=childUnvisited(v);
			while(v1!=-1){
				q.offer(v1);
				display(v1);
				vList[v1].isVisited=true;
				v1=childUnvisited(v);
				
			}
			
		}
			
		restorUnvisited();
		
		
	}
	
	
	public void dfs(){
		Stack<Integer> st = new Stack();
		if(this.vList[0]!=null){
			display(0);
			vList[0].isVisited=true;
			st.push(0);
		}
		
		while (!st.isEmpty()){
			int v = st.peek();
			int ch  = childUnvisited(v); 
			if(ch==-1){				
			st.pop();
			}
			else{
				st.push(ch);
				display(ch);
				vList[ch].isVisited=true;

			}
			
		}
		
		// reversing the unvisited to false.
		restorUnvisited();
		
		
	}
	
	public void mst(){
		Stack<Integer> st = new Stack();
		if(this.vList[0]!=null){
			vList[0].isVisited=true;
			st.push(0);
		}
		
		while (!st.isEmpty()){
			int v = st.peek();
			int ch  = childUnvisited(v); 
			if(ch==-1){				
			st.pop();
			}
			else{
				st.push(ch);
				display(v);
				vList[v].isVisited=true;
				display(ch);
				vList[ch].isVisited=true;
				
				System.out.println("-------");
			}
			
		}
		
		// reversing the unvisited to false.
		restorUnvisited();
		
		
	}
	
	private void restorUnvisited(){
		for(int i=0;i<this.vListCount;i++){
			vList[i].isVisited=false;
		}
	}
	 

	public void removeConnection(){
		vMat  = new int[10][10];	
	}
	
	public static void main(String args[]){
		
		Graph dfs = new Graph();
		dfs.addVertex('a');
		dfs.addVertex('b');
		dfs.addVertex('c');
		dfs.addVertex('d');
		dfs.addVertex('e');
		dfs.addVertex('g');
		dfs.addVertex('h');
		
		// a -b - c -h
		//  a- d - e - g
		dfs.addConnection(0,1);
		dfs.addConnection(0, 3);
		dfs.addConnection(3, 4);
		dfs.addConnection(4, 5);
		dfs.addConnection(1, 2);
		dfs.addConnection(2, 6);
		System.out.println("dfs ");
		dfs.dfs();
		System.out.println("bfs");
		dfs.bfs();
		
		
		dfs.removeConnection();
		dfs.addConnection(0, 1);
		dfs.addConnection(0, 2);
		dfs.addConnection(0, 3);
		dfs.addConnection(1, 2);
		dfs.addConnection(1, 3);
		dfs.addConnection(1, 4);
		dfs.addConnection(2, 3);
		dfs.addConnection(2, 4);
		dfs.addConnection(3, 4);
		System.out.println("This is mst ");
		dfs.mst();
		
		
		
		
	}

}
