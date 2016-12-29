package com.sortingballs.base;

import com.sortingballs.base.impl.Rack;
import com.sortingballs.base.impl.TreeSortObserver;

public class Driver {

    public static void main(String[] args) {

	TreeSortObserver treeSortObserver = new TreeSortObserver();

	Rack rack = new Rack();

	rack.registerObserver(treeSortObserver);
	
	

    }

}
