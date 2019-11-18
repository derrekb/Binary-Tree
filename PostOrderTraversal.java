package ABinTree_Quiz;
/**
 * Class for PostOrderTraversal
 *Variable val: String Variable to hold value of a leafnode
 *Variable l : Variable to hold left bintree
 *Variable r : Variable to hold right bintree 
 */

public class PostOrderTraversal implements IbintreeVisitor<String,String> {

			//Methods
	//Purpose:To print out leafnode in post-order traversal
	public String leafnode(String val) {
		return val;	}

	//Purpose:To print out interiornode in post-order traversal
	public String interiornode(String val, bintree<String> l, bintree<String> r) {
	return (""+l.getRootval()+""+r.getRootval()+""+val);	}
}
