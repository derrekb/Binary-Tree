package BinaryTree;

public interface IBinaryTree<X> {
	
	public X getRoot();

    public boolean isLeaf();

    public IBinaryTree<X> getLeftBT() throws Exception;

    public IBinaryTree<X> getRightBT() throws Exception;

    public boolean equals(IBinaryTree<X> binaryTree);

    public String inorder();

    public String postorder();

    public X max();

    public <Y> IBinaryTree<Y> map(IBTFunction<X,Y> func);


    public <R> R visit(IBTreeVisitor<X,R> visitor);

}
