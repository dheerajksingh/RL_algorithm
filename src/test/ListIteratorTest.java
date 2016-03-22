package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	
	public static void main(String arg[]){
		  ArrayList list = new ArrayList();
	        ListIterator it = list.listIterator();
	        it.add("first");                         // add a first element
	        System.out.println(it.hasNext());
	        while (it.hasNext()) {                   // but nothint printed
	            System.out.println(it.next());       // by this loop
	        }
	}
}
