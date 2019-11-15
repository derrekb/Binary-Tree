package bintree;

public interface bintree<X> {
	
	public X getRootval();
	
	public Boolean isLeaf();
	
	public bintree<X> getRightbt() throws Exception;
	
	public bintree<X> getLeftbt() throws Exception;
	
	public Boolean equals(bintree<X> t);
	
	public String inorderString();
	
	public <Y> bintree<Y> btMap(IBTreeF<X,Y> f);

	public <X> X visit(treeVisitor<X> v);

}
