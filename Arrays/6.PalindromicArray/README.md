# Palindromic Array

## Problem Statement
Given an array `arr[]` of positive integers, return `true` if all the array elements are palindromes, otherwise return `false`.  
A palindrome number is one that reads the same backward as forward (e.g., `121`, `555`).

---

## Examples

### Example 1
**Input:**  
`arr[] = [111, 222, 333, 444, 555]`  

**Output:**  
`true`  

**Explanation:**  
All numbers in the array are palindromes: `111`, `222`, `333`, `444`, and `555`.

---

### Example 2
**Input:**  
`arr[] = [121, 131, 20]`  

**Output:**  
`false`  

**Explanation:**  
`20` is not a palindrome, hence the result is `false`.

---

## Constraints
- `1 <= arr.size <= 20`  
- `1 <= arr[i] <= 10^5`  

**Expected Time Complexity:** `O(n log n)`  
**Expected Auxiliary Space:** `O(1)`  

---

## Approach
1. Traverse the array element by element.  
2. For each number, check whether it is a palindrome.  
   - Convert the number to a string.  
   - Reverse the string and compare it with the original.  
3. If all elements are palindromes, return `true`; otherwise, return `false`.  

---