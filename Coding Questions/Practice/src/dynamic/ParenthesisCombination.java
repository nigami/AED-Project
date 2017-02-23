package dynamic;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class ParenthesisCombination {
		
	static Set<String> getParenthesis(int num){
		Set<String> combSet= new HashSet<String>();
		if(num==0){
			combSet.add("");
			return combSet;
		}
		
		if(num==1){
			combSet.add("()");
			return combSet;
		}
		
		
		Set<String> outset= getParenthesis(num-1);
		for(String s: outset){
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='('){
					String newStr= s.substring(0,i+1)+"()"+s.substring(i+1);
					combSet.add(newStr);
				}
			}
			combSet.add(s+"()");
		}
		
	
	
		return combSet;
	}
	
	public static void main(String []arg){
//		System.out.println(getParenthesis(new Scanner(System.in).nextInt()));
		System.out.println(generateParam(new Scanner(System.in).nextInt()));
	}
	
	static void addParen( ArrayList<String> list, int leftRem, int rightRem, char[] str, int index){
		if(leftRem<0 || rightRem<leftRem){
			return;
		}
		if(leftRem==0 && rightRem==0){
			list.add(String.copyValueOf(str));
		}else{
			//if(leftRem>=1){
				str[index]='(';
	            addParen(list, leftRem-1,rightRem, str,index+1);
			//}else{
				str[index]=')';
	            addParen(list, leftRem, rightRem-1, str, index+1);
			//}
		}
	}
	
	public static ArrayList<String> generateParam(int count){
		char[] str= new char[count*2];
		ArrayList<String>list= new ArrayList<String>();
		addParen(list,count , count, str, 0);
		return list;
	}
}
