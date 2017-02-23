package recursion;
import java.util.Scanner;
public class AllStar {
	
	public static void main(String arg[]){
		Scanner sa = new Scanner(System.in);
		String input = sa.nextLine();
		System.out.println(allStar(input));
	}
	public static String allStar(String str) {
		  if(str==null) return null;
		  else if(str.length()==0) return "";
		  else if(str.length()==1) return str;
		  
		  return new StringBuilder(String.valueOf(str.charAt(0))).append("*").append(allStar(str.substring(1))).toString();
		}

}
