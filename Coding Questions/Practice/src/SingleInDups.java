import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SingleInDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sa= new Scanner(System.in);
			System.out.println("Enter the Size");
			int length =sa.nextInt();
			
			if(length>0){
				int a[]= new int[length];
				for(int i=0;i<length;i++){
					a[i]= sa.nextInt();
				}
				System.out.println(singleNumber(a));
			}
			
			
			
			System.out.println("End");
	}

	public static int singleNumber(int[] A) {
	    
	    if(A==null) return 0;
	    
	    HashMap<Integer, Integer>aMap= new HashMap<Integer, Integer>();
	    for(int i=0; i< A.length;i++){
	        if(aMap.get(A[i])!=null){
	         int count = aMap.get(A[i])+1;
	         aMap.put(A[i], count);
	        }else{
	            aMap.put(A[i],1);
	        }
	    }

	    for(Map.Entry<Integer, Integer> set: aMap.entrySet()){
	        if(set.getValue()==1){
	            return set.getKey();
	        }
	    }

	    return 0;

	}
}
