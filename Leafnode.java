package BinaryTree;

public class Leafnode<X> implements IBinaryTree<X> {

    private X root;

    public Leafnode(X value) {
        this.root = value;
    }


    @Override
    public X getRoot() {
        return root;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public IBinaryTree<X> getLeftBT() throws Exception {
        throw new Exception("Cannot get the left side of a leafnode");
    }

    @Override
    public IBinaryTree<X> getRightBT() throws Exception{
        throw new Exception("Cannot get the right side of a leafnode");
    }

    @Override
    public boolean equals(IBinaryTree<X> binaryTree) {
        return binaryTree.isLeaf() && binaryTree.getRoot() == this.root;
    }

    @Override
    public String inorder() {
        return this.getRoot().toString();
    }

    @Override
    public String postorder() {
        return this.getRoot().toString();
    }

    @Override
    public X max() {
        return this.getRoot();
    }

    @Override
    public <Y> IBinaryTree<Y> map(IBTFunction<X, Y> func) {
        return new Leafnode<Y>( func.map(this.getRoot()));
    }


   
    @Override
    public <R> R visit(IBTreeVisitor<X, R> visitor) {
        return visitor.Leafnode(this.root);
    }
}

