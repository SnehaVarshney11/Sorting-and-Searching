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

# Insertion Sort
* Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
* Algorithm 
=> To sort an array of size n in ascending order: 
1) Iterate from arr[1] to arr[n] over the array. 
2) Compare the current element (key) to its predecessor. 
3) If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

# Quick Sort
* It follows divide and conquer strategy.
* Let the first element of array is pivot...then-
* We will take two variables i & j. i is in first index which shows pivot and j is in last index which shows the elements which is smaller than pivot so that they can exchange the number. 
* Increase the number of i till we can't find the number greater then pivot and decrement j till we can't find smaller than or equal to pivotand exchange them...and continue this process and when if there is condition that i > j then don't exchange them because here we have found the position of pivot i.e. j.

# Merge Sort
* It is divide and conquer algorithm.
* It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
* The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.