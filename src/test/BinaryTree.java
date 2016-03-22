package test;

import java.util.Stack;



class Node{
	int value;
	Node left;
	Node right;
	
	public Node(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}


public class BinaryTree {
	
	Node root;
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void displayHorizontal(){
		if(root==null)
			return;
		Stack<Node> outer = new Stack<Node>();
		outer.push(root);
		while(true){
			Stack<Node> child = new Stack<Node>();
			
			while(!outer.empty()){
				Node parent = outer.pop();
				System.out.print(parent.value);
				if(parent.right!=null)
					child.push(parent.right);
				if(parent.left!=null)
					child.push(parent.left);
			}
			System.out.println();
			if(child.isEmpty())
				break;
			outer=child;
			
		}
		
	}
	public void displayTree()
	{
	Stack<Node> globalStack = new Stack<Node>();
	globalStack.push(root);
	int nBlanks = 32;
	boolean isRowEmpty = false;
	System.out.println(
	"......................................................");
	while(isRowEmpty==false)
	{
		Stack<Node> localStack = new Stack<Node>();
		isRowEmpty = true;
		for(int j=0; j<nBlanks; j++)
		System.out.print(' ');
		while(globalStack.isEmpty()==false)
		{
			Node temp = globalStack.pop();
			if(temp != null)
			{
				System.out.print(temp.value);
				localStack.push(temp.left);
				localStack.push(temp.right);
				if(temp.left != null ||
				temp.right != null)
				isRowEmpty = false;
			}
			else
			{
				System.out.print("--");
				localStack.push(null);
				localStack.push(null);
			}
		
			for(int j=0; j<nBlanks*2-2; j++)
			System.out.print(' ');
		} // end while globalStack not empty
				System.out.println();
				nBlanks /= 2;
			
				while(localStack.isEmpty()==false)
					globalStack.push( localStack.pop() );
	} // end while isRowEmpty is false
		System.out.println(
		"......................................................");
		} // end displayTree()

	public boolean add(int val){
		if(root==null){
			root = new Node(val);
			return true;
		}
		
		Node currNode = root,prevNode = root;
		boolean isLeft=false;
		
		while(currNode!=null){
			if(currNode.value>val){
				isLeft=true;
				prevNode=currNode;
				currNode=currNode.left;
			}else if(currNode.value<val){
				isLeft=false;
				prevNode=currNode;
				currNode= currNode.right;
			}
			 
		}
		
		if(isLeft){
			prevNode.left=new Node(val);
		}else{
			prevNode.right=new Node(val);
		}
		return true;
	}
	
	
	
	private void inOrder(Node node){
		if(node==null) return;
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	
	public void inOrder(){
		inOrder(root);
	}
	
	private void preOrder(Node node){
		if(node==null) return;
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	public void preOrder(){
		preOrder(root);
	}
	
	private void postOrder(Node node){
		if(node==null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	public void postOrder(){
		postOrder(root);
	}
	
	public void delete(int value){
		
		Node current=root, parent;
		
		while(current!=null){
			parent=current;
			if(current.value>value){
				current = current.left;
			}else if(current.value<value){
				current=current.right;
			}
			else{
				
			}
			
		}
	}
	
	public static void main(String args[]){
		
		BinaryTree bt = new BinaryTree();
		bt.add(30);
		bt.add(34);
		bt.add(56);
		bt.add(67);
		bt.add(23);
		bt.add(27);
		bt.add(29);
		bt.add(31);      
		bt.displayTree();
		//bt.displayHorizontal();
		bt.inOrder();
		System.out.println();
		bt.preOrder();
		System.out.println();
		bt.postOrder();
	}

}
