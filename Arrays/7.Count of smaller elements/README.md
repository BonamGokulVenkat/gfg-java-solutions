# Count of Smaller Elements

## 📖 Problem Statement  
Given an unsorted array `arr` and an integer `x`, find the **count of elements less than or equal to `x`** in the array.

---

## 📊 Examples  

### Example 1  
**Input:**  


x = 9
arr = [10, 1, 2, 8, 4, 5]

**Output:**  


5

**Explanation:** The elements `1, 2, 8, 4, 5` are less than or equal to `9`.

---

### Example 2  
**Input:**  


x = 2
arr = [1, 2, 2, 5, 7, 2, 9]

**Output:**  


4

**Explanation:** The elements `1, 2, 2, 2` are less than or equal to `2`.

---

## ✅ Constraints  
- `1 <= arr.size() <= 10^5`  
- `1 <= ai <= 10^5`  
- `0 <= x <= 10^5`  

**Expected Time Complexity:** O(n)  
**Expected Auxiliary Space:** O(1)  

---

## 💡 Approach  
1. Initialize a counter to 0.  
2. Traverse through the array.  
3. For each element, check if it is less than or equal to `x`.  
4. If true, increment the counter.  
5. Return the final counter value.  

This algorithm ensures a **single traversal** of the array, making it efficient.  

---