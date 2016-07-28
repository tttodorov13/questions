package com;

public class BinarySearchTree<T extends Comparable<T>> {
   
    /**
     * Represents a binary tree node.
     * @author Vesko Kolev
     * @param <T>
     */
    private static class BinaryTreeNode<T extends Comparable<T>>
                implements Comparable<BinaryTreeNode<T>> {

		@Override
		public int compareTo(BinaryTreeNode<T> arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
        //...
        //... The implementation from above goes here!!! ...
        //...
    }
 
    /**
     * The root of the tree.
     */
    @SuppressWarnings("unused")
	private BinaryTreeNode<T> root;
   
    /**
     * Constructs the tree.
     */
    public BinarySearchTree() {
        this.root = null;
    }
 
    //...
    //... The operation implementation goes here!!! ...
    //...
 
}