package BinaryTree;

public class BTreePostOrder implements IBTreeVisitor<Integer, Integer> {

	public String Leafnode(Integer val) {
		return val.getRoot().toString();
	}


	@Override
	public String Interiornode(Integer val, Integer left, Integer right) {
	     try {
	            return this.leftNode.inorder() + this.right.inorder() + this.root;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	}
}
