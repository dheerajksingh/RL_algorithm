package test;

import java.io.File;

public class TestGC {

	
	public static void main(String arg[]){
		int count = 0;
		while (true){
			
			TestThread t = new TestThread(String.valueOf(count++));

			TestThread t1 = new TestThread(String.valueOf(count++));

			TestThread t2 = new TestThread(String.valueOf(count++));

			TestThread t3 = new TestThread(String.valueOf(count++));

			TestThread t4 = new TestThread(String.valueOf(count++));
			
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	}
	
	
}

class TestThread implements Runnable {

    String name;
	
	TestThread(String count){
		this.name= count;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		int rand = (int) (Math.random()*100);
		for(int i = 0 ; i<rand;i++){
			File f = new File(".");
			System.out.println(f.getName()+" "+this.name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}