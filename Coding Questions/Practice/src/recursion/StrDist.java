package recursion;

public class StrDist {
	/*
	 * 
	 * Given a string and a non-empty substring sub, compute recursively the
	 * largest substring which starts and ends with sub and return its length.
	 * Hi=hi
	 * strDist("catcowcat", "cat") → 9 
	 * strDist("catcowcat", "cow") → 3
	 * strDist("cccatcowcatxx", "cat") → 9
	 */
	public int strDist(String str, String sub) {
		  // longest will be like the difference btn first appearence and last
		  //so we need to find first from beginning nd last
		  
		  if(str==null) return 0;
		  int sublen= sub.length();
		  int strlen= str.length();
		  if(strlen==0 || sublen==0 || sublen>strlen) return 0;
		  
		  if(str.substring(0,sublen).equals(sub) && str.substring(strlen-sublen).equals(sub)){
		   return strlen;
		  }
		  if(str.substring(0,sublen).equals(sub)){
		    return strDist(str.substring(0,strlen-1),sub);
		  }
		   return strDist(str.substring(1),sub);
		  
		}

}
