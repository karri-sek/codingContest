# codingContest
### Sorting Balls 
##### Solution
##### Assumption's
* Only Integer values 
##### Approach
 Uses the **observer design pattern**  with one observer registered called *TreeSort Observer*. Considering the Rack is the subject,  whenever any ball added to the rack, corresponding the observer's will get notified. 
 Being multiple observers can sort this item in there one way(ex: one with quick sort, merge sort). That would be an added advantage of this approach.

 * Here I prefered using the Sorting technique backed by Binary Search Tree.
 * Tests has been added in the file **SortingBallsTest.java**.
 * **Driver.java** is the driver file to quick start this solution.
 
##### Reasons on choosing this approach:
 * Each Observer can sort with there own sorting logic.
 * Inserting and inorder traversal of O(logn) with BST.
 * No Hassel on reshuffling using Arrays on sorting logic.
 ---
 ### Spell it out 
##### Solution

##### Assumption's
* Only Positive Integers.
* No decimal numbers.

##### Approach

Uses the **builder design pattern**  to build the meta(config) data for words.
Split the given word by dividing with 1000 as base number and calls recursively the method getWordsForNumber to map the number with word. 
This solution can be used to generate the word from the given number upto **billions**.
 * Tests has been added in the file **NumberToWordConverterTest.java**.
 * **Driver.java** is the driver file to quick start this solution.
 

