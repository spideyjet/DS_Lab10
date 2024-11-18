import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BSTreeTest {
	
	@Test
	public void Setup()
	{
		
	
	}

	@Test
	void test() {
		BSTree A = new BSTree();
		BSTree Z = new BSTree();
		BSTree Y = new BSTree();
		
		assertTrue(A.isEmpty());
		
		A.insert(10);
		
		assertFalse(A.isEmpty());
		
		A.insert(5);
		A.insert(15);
		A.insert(7);
		A.insert(3);
		A.insert(20);
		A.insert(12);
		
		//retrieving the numbers within the tree
		assertEquals(10,A.retrieve(10));
		assertEquals(5,A.retrieve(5));
		
		//false case when retrieving a number not in tree
		assertEquals(null,A.retrieve(1000));
		
		//retrieving the depth of the value within the tree
		assertEquals(0,A.retrieveDepth(10));
		assertEquals(1,A.retrieveDepth(5));
		assertEquals(2,A.retrieveDepth(20));
		
		// test cases for when the value isn't in tree getting depth
		assertEquals(3,A.retrieveDepth(30));
		assertEquals(3,A.retrieveDepth(100));
		
		//returns largest value
		assertEquals(20,A.largest());
		
		//testing size
		assertEquals(7,A.getSize());
		assertEquals(0,Z.getSize());
		
		//the sum of the values
		assertEquals(72,A.sum());
		
		
		
		//creating second tree to compare tree A to
		BSTree B = new BSTree();
		B.insert(10);
		B.insert(5);
		B.insert(15);
		B.insert(7);
		B.insert(3);
		B.insert(20);
		B.insert(12);
		
		//Comparing the two trees
		assertTrue(A.myEquals(B));
		
		//creating a third tree to compare A to
		BSTree C = new BSTree();
		C.insert(10);
		C.insert(5);
		C.insert(15);
		C.insert(7);
		C.insert(3);
		C.insert(500);
		C.insert(1);
		C.insert(700);
		
		assertEquals(700,C.largest());
		
		assertFalse(A.myEquals(C));
		
		//comparing to empty tree
		assertFalse(A.myEquals(Z));
		
		//comparing two empty trees
		assertTrue(Z.myEquals(Y));
		
		assertFalse(Z.myEquals(A));
		
		BSTree D = new BSTree();
		D.insert(50);
		D.insert(25);
		D.insert(75);
		
		assertFalse(C.myEquals(D));
		
		BSTree E = new BSTree();
		E.insert(500);
		E.insert(15);
		E.insert(5);
		E.insert(3);
		E.insert(7);
		E.insert(10);
		E.insert(700);
		E.insert(1);
		
		assertFalse(C.myEquals(E));
		
		//same values with 500 700 and 1 switched and inserted more 
		BSTree F = new BSTree();
		F.insert(10);
		F.insert(5);
		F.insert(15);
		F.insert(7);
		F.insert(3);
		F.insert(1);
		F.insert(500);
		F.insert(700);
		F.insert(250);
		F.insert(300);
		F.insert(123);
		F.insert(75);
		F.insert(54);
		F.insert(99);
		F.insert(345);
		F.insert(631);
		F.insert(937);
		
		assertFalse(C.myEquals(F));
		
		BSTree H = new BSTree();
		H.insert(10);
		H.insert(5);
		H.insert(15);
		H.insert(7);
		H.insert(3);
		H.insert(1);
		H.insert(500);
		H.insert(700);
		H.insert(250);
		H.insert(300);
		H.insert(123);
		H.insert(75);
		H.insert(54);
		H.insert(99);
		H.insert(345);
		H.insert(631);
		H.insert(937);
		H.insert(123);
		
		assertFalse(F.myEquals(H));
		
		// in order list of values be
		int [] A1 = {3, 5, 7, 10, 12, 15, 20,};
		
		BSTree ArrayValues = new BSTree();
		
		List<Integer> L = new ArrayList<Integer>();
		
		
		
		
		
	}
	
	

}
