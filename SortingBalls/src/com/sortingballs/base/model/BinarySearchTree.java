package com.sortingballs.base.model;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

    private Ball ball;
    private BinarySearchTree left;
    private BinarySearchTree right;

    List<Ball> inorderListOfBalls = new LinkedList<Ball>();

    public BinarySearchTree(Ball ball) {
	this.ball = ball;
	this.left = null;
	this.right = null;
    }
    
    public static void main(String[] args){
	Ball b1 = new Ball(20);
	Ball b2 = new Ball(10);	
	BinarySearchTree obj = new BinarySearchTree(b1);
	obj.addNode(b2);
	
	obj.inOrder(obj);
	
    }

    /**
     * As convention, if the key to be inserted < key of the root node, key
     * inserted in left subtree. if the key to be inserted > key of the root
     * node, key inserted in right subtree. if the key to be inserted = key of
     * the root node, key inserted in right subtree.
     * 
     * @param data
     */
    public void addNode(Ball ball) {
	if (ball.getValue() < this.ball.getValue()) {
	    if (this.left != null){
		this.left.addNode(ball);
	    }
	    else {
		this.left = new BinarySearchTree(ball);
	    }
	} else {
	    if (this.right != null){
		this.right.addNode(ball);
	    }
	    else {
		this.right = new BinarySearchTree(ball);
	    }
	}
    }

    /**
     * Recursive In-Order Implementation of Binary Search Tree
     * 
     * @return
     */
    public void inOrder(BinarySearchTree root) {
	if (root == null){
	    return;
	}    
	inOrder(root.left);
	inorderListOfBalls.add(root.ball);
	System.out.println(">>> "+root.ball);
	inOrder(root.right);

    }

    public List<Ball> getListOfBallsInSortedOrder() {
	return inorderListOfBalls;
    }
}
