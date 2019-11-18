package BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bintreeTests {

    @Test
    void test() {
        IBinaryTree<Integer> L = new Leafnode<>(2);
        IBinaryTree<Integer> R = new Leafnode<>(3);
        IBinaryTree<Integer> T = new Interiornode<>(1, L, R);
        IBinaryTree<Integer> L1 = new Leafnode<>(2);
        IBinaryTree<Integer> R1 = new Leafnode<>(3);
        IBinaryTree<Integer> T1 = new Interiornode<>(1, L1, R1);
        IBinaryTree<Integer> DL = new Leafnode<>(4);
        IBinaryTree<Integer> DR = new Leafnode<>(6);
        IBinaryTree<Integer> DT = new Interiornode<>(2, DL, DR);
        try {
            assertEquals(L.getRoot().intValue(), 2);
            assertEquals(T.getRoot().intValue(), 1);
            assertEquals(T.getLeftBT(), L);
            assertEquals(T.getRightBT(), R);
            assertEquals(R.equals(R1), true);
            assertEquals(T.equals(T1), true);
            assertEquals(L1.inorder(), "2");
            assertEquals(T.inorder(), "213");
            assertEquals(R1.map(x -> 2 * x).equals(DR), true);
            assertEquals(T.map(x -> 2 * x).equals(DT), true);
            assertEquals(T.postorder(),"231");
            assertEquals(T.max().intValue(),3);
        } catch (Exception e) {
            System.out.println("Error in test: " + e.getMessage());
        }

    }

}

