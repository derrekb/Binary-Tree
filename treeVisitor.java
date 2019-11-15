package bintree;

public interface treeVisitor<X> {

	public X leafnode(X val);
	
	public X interiornode(X a, X b, X c);
}
