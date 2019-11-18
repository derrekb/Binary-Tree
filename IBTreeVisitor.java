package BinaryTree;


/**
 * This is interface for a BinaryTree Visitor.
 * The visitor interface MUST implement ALL VARIETIES of the data. In this case the varieties are LeafNode and InteriorNode
 * X is the data type that each root in the binary Tree has. In other words it is the value associated withe each node.
 * R is the result from processing the variety of the data. EX: Processing Leafnode -> R, and processing interiornode -> R
 * @param <R>
 */
public interface IBTreeVisitor<X,R> {

    // A leafnode has no child nodes so you can think of this as the base case. Since it is the base case we just need to
    //    return the result of processing the leafnode with type R.
    public R Leafnode(X val);

    // A interiornode has children nodes so a few things need to be down. We must recursively call the leftchild and return its result
    //     as type R, and we must recursively call the rightchild and return its result as type R.
    public R Interiornode(X val, R left, R right);
}
