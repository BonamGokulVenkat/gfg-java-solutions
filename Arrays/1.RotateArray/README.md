# Rotate Array - Left Rotation

## Problem Statement
Given an array `arr[]`, rotate the array to the left (counter-clockwise) by `d` steps, where `d` is a positive integer. The rotation should be done **in-place** and the array is considered circular.

### Examples

1. **Input:** `arr = [1, 2, 3, 4, 5], d = 2`  
   **Output:** `[3, 4, 5, 1, 2]`  
   **Explanation:** Rotating 2 times results in `[3, 4, 5, 1, 2]`.

2. **Input:** `arr = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3`  
   **Output:** `[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]`

3. **Input:** `arr = [7, 3, 9, 1], d = 9`  
   **Output:** `[3, 9, 1, 7]`  

### Constraints
- `1 <= arr.length(), d <= 10^5`  
- `0 <= arr[i] <= 10^5`  

## Approach
We use the **Reversal Algorithm** to rotate the array **in-place**:

1. Reverse the first `d` elements.
2. Reverse the remaining `n-d` elements.
3. Reverse the entire array.

This method has:
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1) (in-place)

### Usage
- Compile: `javac RotateArray.java`
- Run: `java Solution`
- The rotated array will be printed on the console.

## Author
**Bonam Gokul Venkat**  
Final Year B.Tech, AI & Data Science  
