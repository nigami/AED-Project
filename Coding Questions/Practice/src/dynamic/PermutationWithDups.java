package dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationWithDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= new Scanner(System.in).next();
		System.out.println(input);
		List<String> allPerm= new ArrayList<String>();
		permutationWithDups(input,allPerm);
		System.out.println(allPerm);
	}
	public static void permutationWithOutDups(String input, List<String>out){
		if(input==null) return ;
		if(input.length()==0){ out.add("");return;}
		
		if(input.length()==1) {
			out.add(input);
		return;
		}
		 
		permutationWithOutDups(input.substring(1), out);
		List<String> strList =new ArrayList<String>();
		String a = String.valueOf(input.charAt(0));
		
		for(String n: out){
		    int length= n.length();
			for(int i=0; i<=length;i++){
				String comb = new String(insertChar(i, n, a));
				strList.add(comb);
			}
		}
		out.clear();
		out.addAll(strList);
		
		
	}
	public static String insertChar(int i, String n, String a){
		return new String(n.substring(0,i)+a+n.substring(i));
		
	}
}
