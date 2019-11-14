package bintree;

public abstract class Abintree<X> implements bintree<X> {
	
	
	protected X val;
	
	protected Abintree( X v)
	{
		val = v;
	}
	public X getRootVal() {return(val);}
	
	
	public bintree<X> doublebt(){
		return (new interiornode<X> (this.val, this, this));
	}

}
