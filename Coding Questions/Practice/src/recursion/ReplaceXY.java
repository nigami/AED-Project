package recursion;

public class ReplaceXY {
	
	 public String replaceXY(String str, int index){
		  return null;
	  }
	public String replaceXY(String str){
		
	  if(str==null) return null;
	 
	  int length= str.length();
	  if(length==0) return null;
	  else if(length ==1){
	   return ((str.equalsIgnoreCase("x"))?"y":str);
	   
	  }
	  StringBuilder strB = new StringBuilder();
	  if(str.charAt(0)=='x'){
	    strB.append('y');
	  }else{
	    strB.append(str.charAt(0));
	}
	  
	  return strB.toString()+str.substring(1);
	}

}
