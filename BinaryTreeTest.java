package Binary_Tree;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class BinaryTreeTest {

	@Test
	public void giventhreenumbers() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		
		tree.add(56);
		tree.add(30);
		tree.add(70);
		
		int size = tree.getSize();
		
		Assert.assertEquals(3,size);
		
	}

}
