# Sorting
# Linear Search
* Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
* If x matches with an element, return the index.
* If x doesn’t match with any of elements, return -1.

# Selection Sort
* This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts-
a) The sorted part at left end
b) The unsorted part at right end
* Initially, the sorted part is empty and the unsorted part is the entire list.
* The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.

# Counting Sort
* It is a technique based on keys between a specific range.
* It works by counting the number of objects having distinct key values.

# Bubble Sort
* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Example: 
* First Pass: 
* ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
* ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
* ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
* ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
* Second Pass: 
* ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
* ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
* ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
* ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
* Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
* Third Pass: 
* ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
* ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
* ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
* ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 