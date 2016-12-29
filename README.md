# codingContest
Please refer the folder SortingBalls/src for Solution of question 1 : ### Sorting Balls

Assumptions on this Solution:
* Only Integer values 

Approach: 
 Uses the observer pattern with one observer registered called TreeSort Observer. Considered the Rack is the subject
 Whenever any ball added to the rack, corresponding the observer's will get notified. 
 
 Being multiple observers can sort this item in there one way(ex: one with quick sort, merge sort). 
 * Here I prefered using the Sorting technique backed by Binary Search Tree *.
 
 Tests has been added in the file **SortingBallsTest.java**.
 
 Reasons to choose this approach:
 * Each Observer can sort with there own sorting logic.
 * Inserting and inorder traversal of O(logn) with BST.
 * No Hassel on reshuffling with Arrays on sorting.
 
 