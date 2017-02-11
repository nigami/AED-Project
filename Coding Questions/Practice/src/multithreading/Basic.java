package multithreading;
import java.lang.Runnable;
 class MultithreadBasic implements Runnable {
	int i=0;
	static String name=null;
	
	public MultithreadBasic(){
		
	}
	@Override
	public void run(){
		for(int i=1;i<=25;i++){
			System.out.println("Thread "+Thread.currentThread().getName()+" : "+i);
			if(i==24){
				name=Thread.currentThread().getName();
			}
			if(i==20 && Thread.currentThread().getName()=="m1"){
				try{// sleep method always has to be surrounded in try catch
					Thread.currentThread().sleep(1000*3);// sleep is specified in milliseconds
				}catch(InterruptedException ex){ //InterruptedException is thrown by sleep method
					ex.printStackTrace();
				}
			}
			/*
			 * if( name!=null){
				break;
			}
			*/
		}
	}
}


 public class Basic{
	public static void main(String [] arg){
		MultithreadBasic  m1 = new MultithreadBasic();
		MultithreadBasic m2= new MultithreadBasic();
		
		Thread t1 = new Thread(m1,"m1");
		Thread t2 = new Thread(m2,"m2");
		
		t1.start();
		t2.start();
	}
}