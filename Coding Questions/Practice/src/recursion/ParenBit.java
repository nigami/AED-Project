package recursion;

import java.util.Scanner;

public class ParenBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa= new Scanner(System.in);
		String input= sa.nextLine();
		
		System.out.println(parenBit(input));
	}

	public static String parenBit(String str) {
		  if(str==null) return null;
		  if(str.length()<2) return str;
		  if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
		    return str;
		  }else if (str.charAt(0)=='('){
		    return parenBit(str.substring(0,str.length()-1));
		  }else if(str.charAt(str.length()-1)==')'){
		      return  parenBit(str.substring(1));
		  }
		  return  parenBit(str.substring(1,str.length()-1));
		}

}
