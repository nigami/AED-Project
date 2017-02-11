package multithreading;

public class WaitAndNotifyImpl {

	public static void main(String arg[]){
		
		CalculatorThread ct= new CalculatorThread();
		ct.start();
		synchronized(ct){
			try{// main uses wait and notify to communicate with other threads
				ct.wait();// main will wait for ct to send it a notify signal. then only main thread will resume its work.
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(ct.sum);
		}
	}
}

class CalculatorThread extends Thread{
	long sum;
	public void run(){
		synchronized(this){
			for(int i=0; i<100000;i++){
				sum+=i;
			}
			notify();
		}
	}
}

