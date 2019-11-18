package BinaryTree;

public class BTreeVisitorInt implements IBTreeVisitor<Integer, Integer>{

    /**
     * SO now its time to process the data fro the Visitor!!!!
     * Since we implement the IBTreeVisitor we have to process the two variates (leftnode and interiornode)
     */


    // Remember this is the base case! So all we need to do is return the value (aka root)!
    // Hint: remember in the leafnode class we passed int he root!
    @Override
    public Integer Leafnode(Integer val) {
        return val;
    }

    // At this point we are given three values:
    //  1) the current interiornodes root value
    //  2) the GREATEST number from processing the left child
    //  3) the greatest number from processing the right Child
    // So all we have to do is return the greatest of the three!
    @Override
    public Integer Interiornode(Integer val, Integer left, Integer right) {
        if(val > left && val > right)
            return val;
        else if (left > right && left > val)
            return left;
        else
            return right;
    }

}