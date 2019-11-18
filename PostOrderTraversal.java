package ABinTree_Quiz_Emmanuel_Olatunde_Edwin_Navas_Elijah_Bland_Derrek_Beeck;
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
	public String interiornode(String val, String l, String r) {
	return (""+l+""+r+""+val);	}

	
}
