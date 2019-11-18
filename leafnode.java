package ABinTree_Quiz;
/**
 *Purpose: Class for leafnode
 *Variable: v ==> Generic variable to hold value of a leafnode
 * @param <X>
 */
public class leafnode<X> extends Abintree<X> {
	
	protected X val;
			//Methods
	//Purpose: Implement a leafnode
	public leafnode(X v) {
		super(v); 
		val = v;}
	
	//Purpose: To determine if this bintree is a leafnode
	public Boolean isLeaf() {
		return true;	}

	//Purpose: To return the right subtree of this bintree
	public bintree<X> getRightbt() throws Exception{
		//Exception: A leafnode does not have a subtree
		throw new Exception("getRightbt: A leaf does not have a right subtree");}
	
	//Purpose: To return the left subtree of this bintree
	public bintree<X> getLeftbt() throws Exception{
		//Exception: A leafnode does not have a subtree
		throw new Exception("getRightbt: A leaf does not have a left subtree");	}
	
	//Purpose: To determine if leafnode is equal to bintree t
	public Boolean equals(bintree<X> t) {
		return(t.isLeaf() && t.getRootval() == this.getRootval());	}
	
	//Purpose: To print out leafnode in in-order traversal
	public String inorderString() {
		return(this.getRootval().toString());	}
	
	//Purpose: To implement function f on leafnode
	public <Y> bintree <Y> btMap(IBTreeF<X,Y>f){
		return(new leafnode<Y>(f.f(this.getRootval())));	}

	//Purpose: To implement IbintreeVisitor V on leafnode
	public <R> R visit(IbintreeVisitor<X,R> V) {
		return (V.leafnode(val));
	}

	
}
