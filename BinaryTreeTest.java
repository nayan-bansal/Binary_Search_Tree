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
	@Test
	public void createBinaryTreeCheckUsingSizeMethod() {
	
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();
		System.out.println("size is :" + size);
		Assert.assertEquals(13, size);
	}

	@Test
	public void givenNumberWhenSearchedShouldBeFoundInBST() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int key = binaryTree.search(63);
		Assert.assertEquals(63, key);
	}
}
