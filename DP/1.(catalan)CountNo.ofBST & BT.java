// Java code of finding Number of Unique
// BST and BT with N Keys
class GfG {

    // Function to calculate the binomial coefficient C(n, k)
    static int binomialCoeff(int n, int k) {
    if (k > n - k) k = n - k;  // Property: C(n, k) == C(n, n-k)

    int result = 1;
    for (int i = 1; i <= k; i++) {
        result = result * (n - i + 1) / i;  // Multiply and divide in one step
    }

    return result;
}


    // Function to find the nth Catalan number
    static int numBST(int n) {
      
        // Calculate C(2n, n)
        int c = binomialCoeff(2 * n, n);

        // Return the nth Catalan number
        return c / (n + 1);
    }

    // Function to find total binary tree
    static int numBT(int n) {
        int fact = 1;

        // Calculating factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // Total binary tree = Total binary search tree * n!
        return numBST(n) * fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(numBST(n));
        System.out.println(numBT(n));
    }
}

BST:
A **BST (Binary Search Tree)** is a binary tree with the property:  

🔹 **Left subtree** contains only nodes with values **less than** the root.  
🔹 **Right subtree** contains only nodes with values **greater than** the root.  

For `n = 3`, the **5 unique BSTs** are:

---

### **1️⃣ Root = 1**
```
  1
   \
    2
     \
      3
```

---

### **2️⃣ Root = 2**
```
    2
   / \
  1   3
```

---

### **3️⃣ Root = 3**
```
      3
     /
    2
   /
  1
```

---

### **4️⃣ Root = 3, Left = 1, Right of Left = 2**
```
    3
   /
  1
   \
    2
```

---

### **5️⃣ Root = 1, Right = 3, Left of Right = 2**
```
  1
   \
    3
   /
  2
```

---

These **5 structures** are the only **valid BSTs** because they maintain the **BST property**.  

✅ A **binary tree (BT)** allows **any arrangement** of nodes, but a **BST must follow sorting rules**.  

Would you like more details or visual explanations? 😊🚀
--------------------------------------------------------------------------------------------------------------------------------------
Got it! You want a **text-based representation** of all **30 unique Binary Trees** with `n = 3`. I'll list them below by considering all **5 unique BST structures** and permuting the node labels (`1, 2, 3` in all `3! = 6` ways for each structure).  

I'll generate them now. Stay tuned! 😊🚀

Here are all **30 unique Binary Trees** for `n = 3`, categorized by the **5 unique BST structures** and all **6 permutations** of `{1, 2, 3}`.

---
BTree
### **Structure 1: Right-Skewed**
```
  A
   \
    B
     \
      C
```
- (1,2,3)
- (1,3,2)
- (2,1,3)
- (2,3,1)
- (3,1,2)
- (3,2,1)

---

### **Structure 2: Left-Skewed**
```
      A
     /
    B
   /
  C
```
- (1,2,3)
- (1,3,2)
- (2,1,3)
- (2,3,1)
- (3,1,2)
- (3,2,1)

---

### **Structure 3: Root in the Middle**
```
    A
   / \
  B   C
```
- (1,2,3)
- (1,3,2)
- (2,1,3)
- (2,3,1)
- (3,1,2)
- (3,2,1)

---

### **Structure 4: Root Skewed Right**
```
    A
   /
  B
   \
    C
```
- (1,2,3)
- (1,3,2)
- (2,1,3)
- (2,3,1)
- (3,1,2)
- (3,2,1)

---

### **Structure 5: Root Skewed Left**
```
    A
     \
      B
     /
    C
```
- (1,2,3)
- (1,3,2)
- (2,1,3)
- (2,3,1)
- (3,1,2)
- (3,2,1)

---

This gives **5 structures × 6 permutations = 30 unique Binary Trees**! 🎉🌳

Let me know if you need further explanation! 😊
