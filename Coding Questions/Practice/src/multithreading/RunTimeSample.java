package multithreading;

import java.io.IOException;
import java.util.Date;

public class RunTimeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date().getMonth());
		Runtime rt= Runtime.getRuntime();
		
		System.out.println(rt.totalMemory());
		System.out.println(rt.availableProcessors());
		System.out.println(rt.freeMemory());
		System.gc();
		
		System.out.println(rt.freeMemory());
//		try {
//			rt.exec("notepad");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//will open a new notepad  
	}
}
