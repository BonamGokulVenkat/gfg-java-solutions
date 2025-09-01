# 📌 Find Index

### Difficulty: Easy  
**Accuracy:** 34.99%  
**Submissions:** 98K+  
**Points:** 2  

---

## 📝 Question

Given an **unsorted array `arr[]` of integers** and a **key** which is present in this array.  

You need to write a program to find:  
- **Start Index** → the index where the element is **first found from the left** in the array.  
- **End Index** → the index where the element is **first found from the right** in the array.  

Return an array of length 2 with elements **[start, end]**.  

👉 If the key does **not exist** in the array, return `[-1, -1]`.  

⚡ Note: **0-based indexing is used.**

🔗 [View Problem on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-index4752/1)

---

## ✅ Examples

### Example 1
**Input:**  
arr[] = [1, 2, 3, 4, 5, 5], key = 5


**Output:**  
[4, 5]


**Explanation:**  
- `5` first appears at index `4`.  
- `5` last appears at index `5`.  

---

### Example 2
**Input:**  
arr[] = [6, 5, 4, 3, 1, 2], key = 4


**Output:**  
[2, 2]


**Explanation:**  
- `4` first and last appears at index `2`.  

---

### Example 3
**Input:**  
arr[] = [7, 8, 6], key = 2


**Output:**  
[-1, -1]


**Explanation:**  
- Since `2` does not appear in the array, return `[-1, -1]`.  

---

## ⏱️ Constraints

- `1 ≤ arr.size ≤ 10^6`  
- `1 ≤ arr[i], key ≤ 10^9`  

---

## 📊 Expected Complexity

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)  
