package ABinTree_Quiz;

public interface bintree<X> {
	//Purpose: To obtain the value of a leafnode
	public X getRootval();
	//Purpose: To determine if this bintree is a leafnode
	public Boolean isLeaf();
	//Purpose: To obtain the right leafnode of an interiornode
	public bintree<X> getRightbt() throws Exception;
	//Purpose: To obtain the left leafnode of an interiornode
	public bintree<X> getLeftbt() throws Exception;
	//Purpose: To determine if bintree t is equal to this bintree
	public Boolean equals(bintree<X> t);
	//Purpose: To print this bintree in in-order traversal
	public String inorderString();
	//Purpose: To processs the function f on this bintree
	public <Y> bintree<Y> btMap(IBTreeF<X,Y> f);
	//Purpose: To apply visitor class to this bintree
	public <R> R visit(IbintreeVisitor<X,R> V);
}
