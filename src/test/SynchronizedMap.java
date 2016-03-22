package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMap {

	
	
	
	public static void main(String args[]){
		Map m = new HashMap();
		Map m2= new ConcurrentHashMap();
		
			
		
		m = Collections.synchronizedMap(m);
		Hashtable h = new Hashtable();
		
		
	}
}
