package test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class A {
	
	int val=40;

	
}
public class PassByValue {

	
	
	void display(int val , A a){
		val=50;
		a.val=50;
	}
	
	public void test123 (List ldy){
		ldy.add(new File("testfile"));
	}
	public static void main(String args[]){
		A a  = new A();
		PassByValue p = new PassByValue();
		int val = a.val;
		p.display(val, a);
		System.out.println(" val "+a.val+" val "+val);
		
		List<String> str = new ArrayList<String >();
		str.add("string1");
		List list= new ArrayList();
		list= str;
		list.add(new Date());
		p.test123(list);
		System.out.println(list);
	}

	ThreadLocal t = new ThreadLocal();
}
