# flattenArray
### Problem statement
Write some code, that will flatten an array of arbitrarily nested arrays of integers into a flat array of
integers. e.g. [[1,2,[3]],4] -> [1,2,3,4].
### Algorithm to solve this
Recursion is used in this algorithm
1. For each element in input array repeat 
2. Check if element is integer or array
3. If element is an integer add it to a list.
4. If element is an array, call the method again with present element as the argument.

FlattenArray.java contains method which implement the above algorithm

IntegerArrayFlattenerTest.java test all the scenario.

### To build and test the algorithm 

Run command _mvn clean test_.

