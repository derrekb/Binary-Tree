package BinaryTree;

public class Interiornode<X> implements IBinaryTree<X> {
    private IBinaryTree<X> leftNode;
    private IBinaryTree<X> rightNode;
    private X root;

    public Interiornode(X value, IBinaryTree<X> left, IBinaryTree<X> right) {
        this.leftNode = left;
        this.rightNode = right;
        this.root = value;
    }

    @Override
    public String postorder() {
        try {
            return this.leftNode.inorder() + this.rightNode.inorder() + this.root;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public X max() {
        if (this.rightNode == null) {
            return this.root;
        } else {
            return this.rightNode.max();
        }
    }

    @Override
    public X getRoot() {
        return this.root;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public IBinaryTree<X> getLeftBT() throws Exception {
        return this.leftNode;
    }

    @Override
    public IBinaryTree<X> getRightBT() throws Exception {
        return this.rightNode;
    }

    @Override
    public boolean equals(IBinaryTree<X> binaryTree) {
        try {
            return !binaryTree.isLeaf()
                    && binaryTree.getRoot() == this.root
                    && this.rightNode.equals(binaryTree.getRightBT())
                    && this.leftNode.equals(binaryTree.getLeftBT());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String inorder() {
        try {
            return this.leftNode.inorder() + this.root + this.rightNode.inorder();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public <Y> IBinaryTree<Y> map(IBTFunction<X, Y> func) {
        try {
            return new Interiornode<Y>(func.map(this.getRoot()), this.leftNode.map(func), this.rightNode.map(func));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * A Interiornode has a value and TWO children associated with it. so what we need to do is use the visitor that the
     * function takes as a parameter and call the Interiornode function associated with the visitor. the interiornode function takes
     * in three things:
     * 1) the value of the current node
     * 2) the RESULT of processing the left child
     * 3) the RESULT of processing the right child
     * So when we call visitor.Interiornode we will pass in the value (root) and then leftNode.visit with the same visitor and
     * rightNode.visit with the same visitor. calling leftNode.visit and rightNode.vist will gives us the RESULTS of visiting the
     * left and right child nodes.
     */
    @Override
    public <R> R visit(IBTreeVisitor<X, R> visitor) {
        return visitor.Interiornode(root, leftNode.visit(visitor), rightNode.visit(visitor));
    }
}


