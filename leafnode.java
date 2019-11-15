package bintree;

public class leafnode<X> extends Abintree<X> {
	
	public leafnode(X v) {
		super(v);
		}
	
	public Boolean isLeaf() {
		return(true);
		}
	
	public bintree<X> getRightbt() throws Exception{
		throw new Exception("getRightbt: A leaf doesnot have a right subtree"); 
		}
	
	public bintree<X> getLeftbt() throws Exception{
		throw new Exception("getLeftbt: A leaf doesnot have a left subtree");
		}
	
	public Boolean equals(bintree<X> t){
		return(t.isLeaf() && t.getRootval() == this.val);
		}
	
	public String inorderString() {
		return(this.getRootval().toString());
		}
	
	public <Y> bintree<Y> btMap(IBTreeF<X,Y> f){
		return(new leafnode<Y>(f.f(this.getRootval()))); 
		}
	
	
	public X getRootval() {
		return val;
	}


	
	public <X> X visit(treeVisitor<X> v) {
		return(v.leafnode((X) this.val));
	}
	}
	

