package ABinTree_Quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bintreeTests {
	@Test
	void test() {
		
		try {
		bintree<Integer> L = new leafnode<Integer>(2);
		bintree<Integer> R = new leafnode<Integer>(3);
		bintree<Integer> T = new interiornode<Integer>(1,L,R);
		bintree<Integer> L1 = new leafnode<Integer>(2);
		bintree<Integer> R1 = new leafnode<Integer>(3);
		bintree<Integer> T1 = new interiornode<Integer>(1,L1,R1);
		bintree<Integer> DL = new leafnode<Integer>(4);
		bintree<Integer> DR = new leafnode<Integer>(6);
		bintree<Integer> DT = new interiornode<Integer>(2,DL,DR);
		bintree<String> Z = new leafnode<String>("Derek");
		bintree<String> Y = new leafnode<String>("Elijah");
		bintree<String> ZY = new interiornode<String>("Emmanuel",Z,Y);
		bintree<String> E = new interiornode<String>("Moses",ZY,Y);
		bintree<Integer> C = new interiornode<Integer>(1,DT,DL);
		bintree<Integer> D = new interiornode<Integer>(1,C,DT);
		IbintreeVisitor<String,String> A = new PostOrderTraversal();
		IbintreeVisitor<Integer,Integer> B = new MaxInt();
		
		assertEquals(L.getRootval().intValue(),2);
		assertEquals(T.getRootval().intValue(),1);
		assertEquals(T.getLeftbt(), L);
		assertEquals(T.getRightbt(), R);
		assertEquals(R.equals(R1), true);
		assertEquals(T.equals(T1), true);
		assertEquals(L1.inorderString(), "2");
		assertEquals(T.inorderString(), "213");
		assertEquals(R1.btMap(x -> 2 * x).equals(DR), true);
		assertEquals(T.btMap(x -> 2 * x).equals(DT), true);
		assertEquals(Z.visit(A), "Derek");
		assertEquals(ZY.visit(A), ""+"Derek"+""+"Elijah"+"Emmanuel");
		assertEquals(E.visit(A), ""+"Derek"+""+"Elijah"+"Emmanuel"+"Elijah"+"Moses");
		assertEquals(L.visit(B), 2);
		assertEquals(T.visit(B), 3);
		assertEquals(DT.visit(B), 6);
		assertEquals(C.visit(B), 6);
		assertEquals(D.visit(B), 6);
	
		}
		
	catch(Exception e) {
		System.out.println("Error in test: "+ e.getMessage());
	}
		
		
		
	}

}
