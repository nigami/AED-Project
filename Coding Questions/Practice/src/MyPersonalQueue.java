import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;


public class MyPersonalQueue {
	Stack slackOld, slackNew;
	
	public MyPersonalQueue(){
		 slackOld= new Stack();
		 slackNew= new Stack();
	}
	
	public void add(int number){
		slackNew.push(number);
	}
	
	public int remove(){
		shiftSlack();
		return (Integer) slackOld.pop();
	}
	
	public void shiftSlack(){
		if(slackNew.isEmpty()){
		    while(!slackNew.isEmpty()){
		      slackOld.push(slackNew.pop());
		    }
		}
	}
	//Find the First Non Duplicate Character in a String 
	public static void main(String[] args) {
		int num[]={1,2,8,9,6,};
		
		System.out.println(firstNonRepeatedCharacter("aaaabc"));
	}
	

public static Character firstNonRepeatedCharacter(String str) {
    Queue tmap = new LinkedList();
    
    int length  = str.length();
    
    for(int i=0;i<length;i++){
      //  int val= tmap.(str.charAt(i));
        if(tmap.contains(str.charAt(i))){
           str= str.replace(str.charAt(i),' ');
           System.out.println(str);
        }else{
            tmap.add(str.charAt(i)); 
        }
    }
    //str.replace('%',' ');
    str=str.trim();
    //System.out.println("str"+str+str.isEmpty());
    if(null!=str && !str.isEmpty()) return str.charAt(0);
    return null;
}

	
public static Character firstNonRepeatedCharacterHmap(String str) {
   HashMap hmap = new HashMap();
   int length  = str.length();
    
    for(int i=0;i<length;i++){
      //  int val= tmap.(str.charAt(i));
        if(hmap.containsKey(str.charAt(i))){
        	hmap.put(str.charAt(i),hmap.get(str.charAt(i)+1)); 
        }else{
            hmap.put(str.charAt(i),1); 
        }
    }
    

    //str.replace('%',' ');
    str=str.trim();
    //System.out.println("str"+str+str.isEmpty());
    if(null!=str && !str.isEmpty()) return str.charAt(0);
    return null;
}

}
