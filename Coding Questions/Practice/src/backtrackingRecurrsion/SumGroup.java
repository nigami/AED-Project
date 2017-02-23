/**
 * 
 */
package backtrackingRecurrsion;

/**
 * @author Ila
 *
 */
import java.util.Scanner;
public class SumGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[]arr= new int[5]; int index=0;
		while(sc.hasNext() && index<3){
			arr[index]=sc.nextInt();
			index++;
		}
		System.out.println(groupSum1(0,arr,15));
	}
	
	public static boolean groupSum(int start, int[] nums, int target) {
		System.out.println("start........."+start);
		System.out.println("nums[start]......"+nums[start]);
		System.out.println("target....."+target);
		 if(nums==null) return false;
		  if(start>=nums.length) {
			  boolean flag= (target==0)?true:false;
			  System.out.println("flag..."+flag);
			  return flag;
		  }
		  
		  boolean x= groupSum( start+1, nums,  target-nums[start]);
		  System.out.println("x...."+x);
		  boolean y = groupSum(start+1, nums,  target) ;
		  System.out.println("y...."+y);
		  System.out.println("x||y...."+(x||y));
		 return x||y;
		 
		}
	
	public static boolean groupSum1(int start, int[] nums, int target)
	{
	  if(target == 0)
	  	return true;
	  if(start == nums.length)
	  	return false;
	  if(groupSum1(start + 1, nums, target - nums[start]))
	  	return true;
	  return groupSum1(start + 1, nums, target);
	}
	/*public boolean groupSum(int start, int[] nums, int target) {
	  if(nums==null) return false;
	  if(start>=nums.length) return (target==0)?true:false;
	  
	  
	  return groupSum( start+1, nums,  target-nums[start]) || groupSum(start+1, nums,  target) ;

	}*/
		 
		


}
