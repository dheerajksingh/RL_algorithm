package com.linklist;

public class LinkList {

	Link first;
	Link last;
	
	
	public LinkList(){
		first=null;
		last=null;
	}
	
	public void insertFirst(int i , double d){
		Link newLink = new Link(i,d);
		if(last==null){
			last=newLink;
		}
		newLink.next= first;
		first = newLink;
	}
	
	
	public void insertLast1(int i, double d){
		Link newLink = new Link(i,d);
		if(first==null){
			first = last = newLink;
		}else{
			last.next=newLink;
			last = newLink;
			
		}
	}
	public void insertLast(int i , double d){
		Link current = first;
		if(current==null)
			first = new Link(i,d);
		else{
		while(current.next!=null)
			current =current.next;
		  current.next = new Link(i,d);
		}
		
	}
		
//	public Link deleteFirst(){
//		System.out.println("****** Deleting **** ");
//		
//		Link temp = first;
//		first=first.next;
//		temp.displayLink();
//		System.out.println("****** done deleting **** ");
//
//		return temp;
//	}

	public boolean isEmpty(){
		return first==null;
	}
	public void displayList(){
		Link current = first;
		
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
	}

	public Link find(int key){
		Link current = first;
		
		while(current!=null){
			if(current.i==key)
			return current;
			current=current.next;
		}
		return null;
		
	}
	

	
	Link reverse(Link prev, Link curr) {
		
		if(curr.next==null){
			curr.next=prev;
			this.first=curr;
			return prev ;
		}
		 return reverse(curr,curr.next).next=prev;
	
	}
	
   void  reversingLinkListWithRecursion(Link l){
	   
	   Link start = reverse(l,l);
	   start.next=null;
   }
	
	public static void main(String args[]){
		LinkList lnk = new LinkList();
//		//lnk.find(7);
//		lnk.insertFirst(1,78d);
//		lnk.insertFirst(4, 6d);
//		lnk.insertFirst(1,6d);
//		lnk.insertFirst(4,3d);		
//		lnk.insertFirst(1,3d);
//		lnk.insertFirst(7,34d);	
//		
//		lnk.displayList();
//		LinkList lListReverse = lnk.reverse(lnk);
//		System.out.println("reversing the list ");
//		lListReverse.displayList();
//		
//		System.out.println(" reversing again back to where we started ");
//		LinkList lListReverse1 = lnk.reverse(lListReverse);
//		lListReverse1.displayList();
//		
//		System.out.println("last element ---------------");
//		lnk.last.displayLink();
//		
//		//lnk.find(4).displayLink();
//		
//		//lnk.displayList();
//		
//		//lnk.deleteFirst();
//		
//		//lnk.displayList();
//		
//		System.out.println(" Inserting last  -- ");
//		LinkList lnk1 = new LinkList();
//		lnk1.insertLast(1, 1d);
//		lnk1.insertLast(2, 2d);
//		lnk1.insertLast(3, 3d);
//		lnk1.insertLast(4, 4d);
//		lnk1.displayList();
//
//		System.out.println(lnk1.last);
//		
		System.out.println(" Inserting last1  -- ");
		LinkList lnk2 = new LinkList();
		lnk2.insertLast1(1, 1d);
		lnk2.insertLast1(2, 2d);
		lnk2.insertLast1(3, 3d);
		lnk2.insertLast1(4, 4d);
		lnk2.displayList();
//		System.out.println(lnk2.last);
//		
		lnk2.reversingLinkListWithRecursion(lnk2.first);
		lnk2.displayList();

		
		
	}
}
