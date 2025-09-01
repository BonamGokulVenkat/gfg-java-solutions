# Alternates in an Array

## Problem Statement
Given an array `arr[]`, return a list of elements in **alternate order**, starting from index 0.

### Examples

1. **Input:** `arr = [1, 2, 3, 4]`  
   **Output:** `[1, 3]`  
   **Explanation:** Take first element 1, skip 2, take 3, skip 4.

2. **Input:** `arr = [1, 2, 3, 4, 5]`  
   **Output:** `[1, 3, 5]`  
   **Explanation:** Take elements at index 0, 2, 4.

### Constraints
- `1 <= arr.length <= 10^5`  
- `1 <= arr[i] <= 10^5`  

## Approach
We use a **simple linear traversal** with a step size of 2:

1. Initialize an empty list `result`.
2. Traverse the array from index 0 to n-1, incrementing by 2.
3. Add each element to the result list.
4. Return the list of alternate elements.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

### Usage
- Compile: `javac AlternateElementsArray.java`  
- Run: `java Solution`  
- The alternate elements will be printed on the console.

## Author
**Bonam Gokul Venkat**  
Final Year B.Tech, AI & Data Science
