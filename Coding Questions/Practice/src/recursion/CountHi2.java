package recursion;

public class CountHi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//
//Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
//
//countHi2("ahixhi") → 1
//countHi2("ahibhi") → 2
//countHi2("xhixhi") → 0

	
	public int countHi2(String str) {
		  //x--> substring 2
		  //charAt0=h, charAt1=i -> count++->substring 2
		//xxhi--> substring 1 <<<<<important
		  if(str==null) return 0;
		  if(str.length()<2) return 0;
		  if (str.charAt(0)!='h' && str.charAt(0)!='x'){
		     return countHi2(str.substring(1));
		   }else if(str.charAt(0)=='x' && str.charAt(1)!='h'){
		        return countHi2(str.substring(1));
		   } 
		  return ((str.charAt(0)=='h' && str.charAt(1)=='i')? 1:0)+countHi2(str.substring(2));
		}
	
}
