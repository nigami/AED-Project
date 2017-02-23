package dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NumSteps {
	
	public static void main(String arg[]){
		ArrayList<Integer>  input = getInput();
		List<Integer> list= new ArrayList<Integer>();
		System.out.println(getSubSet2(input));
	}

	public static boolean getPowerSet(	ArrayList<Integer> input,int start,int end ,List<Integer> list){
		if(end==0) {
			list.addAll(new ArrayList<Integer>());
			return true;
		}
		if(start==0) {
			list.addAll(new ArrayList<Integer>());
			return true;
		}
		
		return false;
	}
	public static ArrayList getInput(){
		Scanner sa= new Scanner(System.in);
		String i=sa.next();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for(String in:i.split(",")){
		 arr.add(Integer.parseInt(in));
		}
		
		for(int in:arr){
			System.out.println(in);
			}
		return arr;
		
	}
	
	public static ArrayList<ArrayList<Integer>> getSubSet2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allSubSet= new ArrayList<ArrayList<Integer>>();
		int max= 1<< set.size();// max= 2^n, because max is a bit integer
		for(int k=0; k<max;k++){
			ArrayList<Integer> newSubSet= getSetFromBits(k,set);
			allSubSet.add(newSubSet);
		}
		return allSubSet;
		
	}
	
	public static ArrayList<Integer> getSetFromBits(int x, ArrayList<Integer>set){
		ArrayList<Integer> subset= new ArrayList<Integer>();
		int index=0;
		for(int k=x;k>0;k>>=1){
			System.out.println(k);
			if((k&1)==1){
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
	}
}
