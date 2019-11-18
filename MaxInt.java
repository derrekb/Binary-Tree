package ABinTree_Quiz_Emmanuel_Olatunde_Edwin_Navas_Elijah_Bland_Derrek_Beeck;
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
	public Integer interiornode(Integer val, Integer l, Integer r) {
		Integer res;
		res = Math.max(val, Math.max(l, r));
		return res;
	}

}
