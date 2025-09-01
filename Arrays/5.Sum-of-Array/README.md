# Sum of Array

## Problem Statement
Given an integer array `arr[]`, find and return the **sum of all elements** in the array.

### Examples

1. **Input:** `arr = [1, 2, 3, 4]`  
   **Output:** `10`  
   **Explanation:** 1 + 2 + 3 + 4 = 10.

2. **Input:** `arr = [1, 3, 3]`  
   **Output:** `7`  
   **Explanation:** 1 + 3 + 3 = 7.

### Constraints
- `1 <= arr.length <= 10^5`  
- `1 <= arr[i] <= 10^4`  

## Approach
We use a **simple linear traversal**:

1. Initialize a variable `sum = 0`.
2. Traverse the array and add each element to `sum`.
3. Return the final value of `sum`.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

### Usage
- Compile: `javac SumOfArray.java`  
- Run: `java Solution`  
- The sum of array elements will be printed on the console.

## Author
**Bonam Gokul Venkat**  
Final Year B.Tech, AI & Data Science
