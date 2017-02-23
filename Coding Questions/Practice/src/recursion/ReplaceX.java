package recursion;

public class ReplaceX {
	/*
	 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
	 * noX("xaxb") → "ab"
	 * noX("abc") → "abc"
	 */
	
	//always remember to compare strings with equals method, == gives wrong ans
	//char can be compared with ==
	//remember to toString StringBuilder to convert to String again
	public String noX(String str) {
		  if(str==null) return null;
		  int length= str.length();
		  if(length==0) return "";
		  if(length==1) return (str.equals("x"))?"":str;
		  
		  StringBuilder include= new StringBuilder();
		  if(str.charAt(0)=='x') {
		    include.append("");
		  }else include.append(str.charAt(0));
		  return include.append(noX(str.substring(1))).toString();
		}
}
