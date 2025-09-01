# Find Largest Element in Array

## Problem Statement
Given an array `arr[]`, find and return the **largest element** in the array.

### Examples

1. **Input:** `arr = [1, 8, 7, 56, 90]`  
   **Output:** `90`  
   **Explanation:** The largest element of the array is 90.

2. **Input:** `arr = [5, 5, 5, 5]`  
   **Output:** `5`  
   **Explanation:** All elements are equal, so 5 is the largest.

3. **Input:** `arr = [10]`  
   **Output:** `10`  
   **Explanation:** Only one element exists, which is the largest.

### Constraints
- `1 <= arr.length <= 10^6`  
- `0 <= arr[i] <= 10^6`  

## Approach
We use a **linear traversal** to find the largest element:

1. Initialize `max` with the first element.
2. Traverse the array from the second element:
   - If the current element is greater than `max`, update `max`.
3. Return `max`.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

### Usage
- Compile: `javac FindLargestElement.java`
- Run: `java Solution`
- The largest element will be printed on the console.

## Author
**Bonam Gokul Venkat**  
Final Year B.Tech, AI & Data Science
