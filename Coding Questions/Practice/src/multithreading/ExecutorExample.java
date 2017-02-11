package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
public class ExecutorExample {

	public static void main(String arg[]){
		ExecutorService es =  Executors.newSingleThreadExecutor();
		es.execute(new Runnable(){
			public void run(){
				System.out.println("ila is good ,i love multithreading");
			}
		});
		
		
		
		try {
			Future<Object> future = es.submit( new Callable<Object>(){
				public String call() throws Exception{
					return "Result";
				}
			});
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		es.shutdown();
	}
	
	
}
	
