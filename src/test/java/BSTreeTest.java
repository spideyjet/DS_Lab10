import static org.junit.jupiter.api.Assertions.*;

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
		
		
		
	}

}
