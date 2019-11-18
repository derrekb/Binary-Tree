package ABinTree_Quiz;
/**
 * Class for PostOrderTraversal
 *Variable val: String Variable to hold value of a leafnode
 *Variable l : Variable to hold left bintree
 *Variable r : Variable to hold right bintree 
 */
public class MaxInt implements IbintreeVisitor<Integer,Integer> {

	//Purpose: To return the value of a leafnode
	public Integer leafnode(Integer val) {
		return val;
	}
	
	//Purpose: To return the maximum of this interiornode
	public Integer interiornode(Integer val, bintree<Integer> l, bintree<Integer> r) {
		Integer res;
		res = Math.max(val, Math.max(l.getRootval(), r.getRootval()));
		return res;
	}

}
