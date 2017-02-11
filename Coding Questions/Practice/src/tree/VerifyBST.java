package tree;


public class VerifyBST {

	public boolean verifyBSTFromBT(TreeNode root){
		int bstArr[]= new int[size(root)];
		bstArr=verifyBSTFromBT(root,bstArr,0);
		for(int i=0;i<bstArr.length-1;i++){
			if(bstArr[i+1]<bstArr[i]){
				return false;
			}
		}
		return true;
		
	}
	
	public int[] verifyBSTFromBT(TreeNode root, int[] bstArr, int size){
		if(root==null) return null;
		verifyBSTFromBT(root.left,bstArr,size);
		bstArr[size]=root.val;
		size++;
		verifyBSTFromBT(root.right,bstArr,size);
		return bstArr;
	}
	
	public int size(TreeNode root){
		int size=0;
		size =size(root, size);
		return size;
	}
	
	public int size(TreeNode root, int size){
		if(root==null)return 0;
		size++;
		if(root.left!=null){
			size= size(root.left,size);
		}
		if(root.right!=null){
			size= size(root.right,size);
		}
		return size;
	}
}
