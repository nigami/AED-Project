import java.util.ArrayList;
import java.util.LinkedList;


public class MinimalTreeByLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LinkedList<TreeNode>> arrlist= new ArrayList<LinkedList<TreeNode>>();
		TreeNode root = new TreeNode();
		LinkedList<TreeNode> levelList= new LinkedList<TreeNode>();
		startCreatingMinimalTree(root,arrlist,0);
	}

	public static void startCreatingMinimalTree(TreeNode root,ArrayList<LinkedList<TreeNode>> arrList,int level){
		
		if(root==null) return;
		LinkedList<TreeNode> levelList;
		
		if(arrList.get(level)==null){
			levelList = new LinkedList<TreeNode>();
			arrList.add(levelList);
		}else{
			levelList=arrList.get(level);
		}
		
		levelList.add(root);
		startCreatingMinimalTree(root.left,arrList,level+1);
		startCreatingMinimalTree(root.right,arrList,level);
		
		
	}
	public static class TreeNode{
		int data;
		TreeNode left, right;
		public TreeNode(int data){
			left=right=null;
			this.data= data;
		}
		
		
		public TreeNode(){
			left=right=null;
			data=0;
		}
		
	}
	
	
}
