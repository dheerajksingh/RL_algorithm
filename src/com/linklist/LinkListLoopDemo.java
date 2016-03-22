package com.linklist;

public class LinkListLoopDemo {
	
	LinkList lnk;
	public void createLoopLinkList(){
		lnk=new LinkList();
		lnk.insertFirst(1, 1);
		lnk.insertFirst(2, 2);
		lnk.insertFirst(3, 3);
		lnk.insertFirst(4, 4);
		lnk.insertFirst(5, 5);
		lnk.insertFirst(6, 6);
		lnk.insertFirst(7, 7);

		lnk.last.next=lnk.first.next.next;
		
	}

	public void createLinkList(){
		lnk=new LinkList();
		lnk.insertFirst(1, 1);
		lnk.insertFirst(2, 2);
		lnk.insertFirst(3, 3);
		lnk.insertFirst(4, 4);
		lnk.insertFirst(5, 5);
		lnk.insertFirst(6, 6);
		lnk.insertFirst(7, 7);

	}
	
	public boolean detectLoop(){
	 Link current,current2 = (lnk==null?null:lnk.first);
	 	   current=current2;	
	 while(current!=null){
		 current2=(current2==null?null:(current2.next==null?null:current2.next.next));
		 if(current==current2)
			 return true;
		 current=current.next;
	 }
	 return false;
	}
	
	public static void main(String args[]){
		LinkListLoopDemo linkListLoopDemo = new LinkListLoopDemo();
		linkListLoopDemo.createLoopLinkList();
		//linkListLoopDemo.createLinkList();
		System.out.println(" is there a loop - "+linkListLoopDemo.detectLoop());
		//linkListLoopDemo.lnk.displayList();
		
		
	}	

}
