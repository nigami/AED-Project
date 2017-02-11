
public class TreeTraversal {
	
	TreeNode root;
	 public static class TreeNode{
		 int data;
		 TreeNode left, right;
		 
		public TreeNode(int data){
			left=right=null;
			this.data=data;
		}
	 }
	 
	 public static void main(String arg[]){
		 TreeTraversal tree= new TreeTraversal();
		 tree.root= new TreeNode(1);
		 tree.root.left=new TreeNode(2);
		 tree.root.right=new TreeNode(3);
		 tree.root.left.left=new TreeNode(5);
		 tree.root.left.right=new TreeNode(6);
		 
		 preOrderTraversal(tree.root);
		 //postOrderTraversal(tree.root);
		 //inOrderTraversal(tree.root);
	 }
	 
	public static void preOrderTraversal(TreeNode root){
		if(root==null) return;
		
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void postOrderTraversal(TreeNode root){
		if(root==null) return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}
	public static void inOrderTraversal(TreeNode root){
		if(root==null) return;
		 inOrderTraversal(root.left);
		 System.out.println(root.data);
		 inOrderTraversal(root.right);
	}
}
