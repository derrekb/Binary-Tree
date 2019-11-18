package BinaryTree;

public class App {

    public static void main(String[] args) throws Exception {
        Leafnode<Integer> oneLeaf = new Leafnode<>(1);
        Leafnode<Integer> twoLeaf = new Leafnode<>(2);
        Leafnode<Integer> threeLeaf = new Leafnode<>(3);
        Leafnode<Integer> fourLeaf = new Leafnode<>(4);


        Interiornode<Integer> nodeA = new Interiornode<>(5, threeLeaf, fourLeaf);
        Interiornode<Integer> nodeB = new Interiornode<>(6, twoLeaf, oneLeaf);
        Interiornode<Integer> nodeC = new Interiornode<>(100, nodeA, nodeB);

        System.out.println(nodeC.isLeaf());
        System.out.println(nodeC.getLeftBT().equals(nodeA));


    }
}
