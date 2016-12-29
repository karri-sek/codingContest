# codingContest
Please refer the folder SortingBalls/src for Solution of question 1 : Sorting Balls

Assumptions on this Solution:
1) Only Integer values 

Approach: 
 Uses the observer pattern with one observer registered called TreeSort Observer. Considered the Rack is the subject
 Whenever any ball added to the rack, corresponding the observer's will get notified. 
 
 Being multiple observers can sort this item in there one way(ex: one with quick sort, merge sort). Here I prefered using 
 the Sorting technique backed by Binary Search Tree. 
 