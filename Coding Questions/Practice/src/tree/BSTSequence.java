package tree;
import java.util.ArrayList;
import java.util.LinkedList;
public class BSTSequence {
 
	public ArrayList<LinkedList<Integer>> allSequence( TreeNode node){
		ArrayList<LinkedList<Integer>> result= new ArrayList<LinkedList<Integer>>();
		
		if(node==null){
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.val);
		
		ArrayList<LinkedList<Integer>> leftSet= allSequence(node.left);
		ArrayList<LinkedList<Integer>> rightSet = allSequence(node.right);
		
		for(LinkedList<Integer>left: leftSet){
			for(LinkedList<Integer> right: rightSet){
				ArrayList<LinkedList<Integer>> weaved = new  ArrayList<LinkedList<Integer>>();
				//weaveList(left,right,weaved,prefix);
				result.addAll(weaved);
			}
		}
		
		return null;
	}
}
