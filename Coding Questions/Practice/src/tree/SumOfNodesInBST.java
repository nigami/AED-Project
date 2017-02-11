package tree;

public class SumOfNodesInBST {
		
	static int sum=0;
		public static int sumOfNode(TreeNode root){
			if(root == null){
				return 0;
			}
			sumOfNode(root.left);
			sum+=root.val;
			sumOfNode(root.right);
			return sum;
		}
		
		
		public static int sumOfNodeNew(TreeNode root){
			if(root == null){
				return 0;
			}
			return sumOfNode(root.left)+root.val+sumOfNode(root.right);
		}
		
		
		public static void main(String arg[]){
			TreeNode root = new TreeNode();
			root.val=1;
			root.left= new TreeNode(2);
			root.right= new TreeNode(3);
			root.right.left= new TreeNode(1);
			root.right.right= new TreeNode(4);
			
			System.out.println(sumOfNode(root));
			System.out.println(sumOfNodeNew(root));
		}
}
