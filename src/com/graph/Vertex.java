package com.graph;

public class Vertex {

	
	char v;
	boolean isVisited;

	
	public Vertex(char v) {
		super();
		this.v = v;
	}

	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
}
