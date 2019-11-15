package bintree;

public interface treeVisitor<X> {

	public X leafnode(int a);
	
	public X interiornode(int a, int b, int c);
}
