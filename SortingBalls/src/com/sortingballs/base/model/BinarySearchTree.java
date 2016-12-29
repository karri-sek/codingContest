package com.sortingballs.base.model;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {
    
    private Ball ball;
    private BinarySearchTree left;
    private BinarySearchTree right;    
    
    public BinarySearchTree(Ball ball){
	this.ball = ball;
	this.left = null;
	this.right = null;
    }
    /**
     * As convention, if the key to be inserted < key of the root node, key inserted in left subtree.
     * if the key to be inserted > key of the root node, key inserted in right subtree.
     * if the key to be inserted = key of the root node, key inserted in right subtree.
     * @param data
     */
    public void addNode(Ball ball) {
	if (ball.getValue() < this.ball.getValue()) {
	    if (this.left != null)
		this.left.addNode(ball);
	    else {
		this.left = new BinarySearchTree(ball);
	    }
	} else {
	    if (this.right != null)
		this.right.addNode(ball);
	    else {
		this.right = new BinarySearchTree(ball);
	    }
	}
    }
    /**
     * Recursive In-Order Implementation of Binary Search Tree 
     * @return 
     */
    public List<Ball> inOrder(BinarySearchTree root) {
	List<Ball> inorderListOfBalls = new LinkedList<Ball>();
	if (root != null) {
	    inOrder(root.left);
	    inorderListOfBalls.add(root.ball);
	    System.out.println(root.ball.getValue());
	    inOrder(root.right);

	}
	return inorderListOfBalls;
    }
}
