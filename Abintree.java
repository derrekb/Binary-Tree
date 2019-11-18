package ABinTree_Quiz;
/**
 * Abstract Class for Binary Tree
 * Variables: val ==> Generic Variable to hold value in a leafnode
 * 				v ==> val
 *
 * @param <X>
 */
public abstract class Abintree<X> implements bintree<X> {
	//Variable
	protected X val;
	
		//Methods	
	//Purpose: Implements a Abintree
	public Abintree(X v) {
		val = v;		}
	
	//Purpose: To Obtain the value of a leafnode
	public X getRootval() {return val;}
}
