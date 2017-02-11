package tree;


 class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	
	public TreeNode(){
		left=null;
		right=null;
		val=0;
	}
	
	public TreeNode(int value){
		this.val=value;
		left=null;
		right=null;
	}
	
	
}

public class IsBalanced {
	
	public int getHeight(TreeNode root){
		if(root==null) return -1;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;	
	}
	
	public boolean isTreeBalanced(TreeNode root){
		if(root ==null) return true;
		if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
			return true;
		}else{
			return isTreeBalanced(root.left)&&isTreeBalanced(root.right);
		}
	}
	
}
