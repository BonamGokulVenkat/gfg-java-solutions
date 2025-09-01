# Second Largest Element in Array

## Problem Statement
Given an array `arr[]` of positive integers, return the **second largest element** from the array. If the second largest element does not exist, return `-1`.

**Note:** The second largest element must be **different from the largest element**.

### Examples

1. **Input:** `arr = [12, 35, 1, 10, 34, 1]`  
   **Output:** `34`  
   **Explanation:** Largest is 35, second largest is 34.

2. **Input:** `arr = [10, 5, 10]`  
   **Output:** `5`  
   **Explanation:** Largest is 10, second largest is 5.

3. **Input:** `arr = [10, 10, 10]`  
   **Output:** `-1`  
   **Explanation:** All elements are equal, so second largest does not exist.

### Constraints
- `2 ≤ arr.length ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^5`  

## Approach
We use a **single-pass linear traversal**:

1. Initialize `largest` and `second` to minimum integer value.
2. Traverse the array:
   - If current element > `largest`, update `second = largest` and `largest = current`.
   - Else if current element > `second` and not equal to `largest`, update `second`.
3. If `second` is still minimum integer value after traversal, return `-1`.
4. Else return `second`.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

### Usage
- Compile: `javac SecondLargestElement.java`  
- Run: `java Solution`  
- The second largest element will be printed on the console.

## Author
**Bonam Gokul Venkat**  
Final Year B.Tech, AI & Data Science
