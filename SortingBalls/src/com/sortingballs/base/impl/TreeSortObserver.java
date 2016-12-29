package com.sortingballs.base.impl;

import java.util.List;

import com.sortingballs.base.Observer;
import com.sortingballs.base.model.Ball;
import com.sortingballs.base.model.BinarySearchTree;

public class TreeSortObserver implements Observer {

    private BinarySearchTree root;
    
    /**
     * Add new node to the binary Search tree as and when it got updated from the subject.
     * The subject here is Rack.
     */
    @Override
    public void update(Ball ball) {
	if(root == null){
	    root = new BinarySearchTree(ball);
	}else{
	    root.addNode(ball);
	}
    }

    /**
     * This Observer Implementation backed by Binary Search Tree.
     * Traversal the Binary Search Tree in Inorder, will give you the Balls in Ascending Order.
     * Keep all these Balls in List to display.
     */
    @Override
    public List<Ball> getSortedBalls() {
	return root.inOrder(root);
    }
}
