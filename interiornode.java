package ABinTree_Quiz;

/**
 * Class for interiornode
 * @param v ==> Generic variable to hold interiornode Root Value
 * @param left ==> Variable to hold left bintree
 * @param right ==> Variable to hold right bintree
 * 			l ==> left
 * 			r ==> right
 */
public class interiornode<X> extends Abintree<X> {

	//Variables
	protected bintree<X> r,l;
	
	//Purpose: To implement an interiornode
	public interiornode(X v, bintree<X> left, bintree<X> right)	{
		super(v);
		l = left;
		r = right;}
	
	//Purpose: To determine if interiornode is a leafnode
	public Boolean isLeaf() {
		return false;}
	
	//Purpose: To obtain interiornode's right bintree
	public bintree<X> getRightbt() throws Exception{
		return this.r;	}
	
	//Purpose: To obtain interiornode's left bintree
	public bintree<X> getLeftbt() throws Exception	{
		return this.l;	}
	
	//Purpose: To determine if interiornode is equal to bintree t
	public Boolean equals(bintree<X> t) {
		try {
			return (!t.isLeaf() && 
					this.getRootval().equals(t.getRootval()) &&
					this.getLeftbt().equals(t.getLeftbt()) &&
					this.getRightbt().equals(t.getRightbt()));}
		catch(Exception e) {
			System.out.println("Error equals in interior node:"+ e.getMessage());
			return false;	}		}
	
	//Purpose: To print out interiornode in in-order traversal
	public String inorderString() {
		try {
			return (this.getLeftbt().inorderString()+""+
					this.getRootval().toString()+""+
					this.getRightbt().inorderString());}
		catch(Exception e) {
			System.out.println("Error inorderString in interiornode: "+e.getMessage());
			return null;	}	}
	
	//Purpose: To implement function f on interiornode
	public <Y> bintree<Y> btMap(IBTreeF<X,Y>f)
	{
		try {
			return(new interiornode<Y>(f.f(this.getRootval()),
					this.getLeftbt().btMap(f),
					this.getRightbt().btMap(f)));}
		catch(Exception e) {
			System.out.println("Error map in interiornode: " + e.getMessage());
			return null;}	}
	
	//Purpose: To implement IbintreeVisitor V on interiornode
	public <R> R visit(IbintreeVisitor<X,R> V) {
		try {
			return (V.interiornode(this.getRootval(), this.getLeftbt(), this.getRightbt()));}
		catch(Exception e) {
			System.out.println("Error visit in interiornode: " + e.getMessage());
			return null;}}
	
}
