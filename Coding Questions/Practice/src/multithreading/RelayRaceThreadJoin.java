package multithreading;

import java.lang.Runnable;
import java.lang.ThreadGroup;

public class RelayRaceThreadJoin {

	public static void main(String arg[]){
		
		ThreadGroup tg1 = new ThreadGroup("India");
		ThreadGroup tg2 = new ThreadGroup("America");
		ThreadGroup tg3 = new ThreadGroup("Germany");
		ThreadGroup tg4 = new ThreadGroup("SriLanka");
		ThreadGroup tg5 = new ThreadGroup("Nepal");
		
		Participants p = new Participants();
		
		// constructor used new Thread(ThreadGroup, Runnable, ThreadName)
		Thread t1 = new Thread(tg1, p, "t1");
		Thread t2 = new Thread(tg2, p, "t2");
		Thread t3 = new Thread(tg3, p, "t3");
		Thread t4 = new Thread(tg4, p, "t4");
		Thread t5 = new Thread(tg5, p, "t5");
		Thread t6 = new Thread(tg1, p, "t6");
		Thread t7 = new Thread(tg2, p, "t7");
		Thread t8 = new Thread(tg3, p, "t2");
		Thread t9 = new Thread(tg4, p, "t2");
		Thread t10 =new Thread(tg5, p, "t2");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}

class Participants implements Runnable{

	@Override
	public void run(){
		
		func();
		
		
		
	}
	
	public void func(){
		for(int i=1; i<=200;i++){
			System.out.println(Thread.currentThread().getName()+" is running.");
		}
		System.out.println(Thread.currentThread().getName()+" is finished.");
	}
	
}