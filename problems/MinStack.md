# Problem: Min Stack

## Problem Summary
Design a stack that supports push, pop, top, and retrieving the minimum element in **constant time (O(1))**.

---

## My Thought Process (Approach)

At first, I thought of using only **one stack** and keeping a variable to store the minimum value.  
Whenever a new value is pushed, I could compare it with the current minimum and update the variable.

But this approach fails when we **pop** elements.  
If the current minimum element is removed, we would not know what the previous minimum was without scanning the whole stack again, which would take **O(n)** time — not allowed.

So I changed my approach.

### Final Idea: Use Two Stacks

I used:
- **Main Stack** → to store all elements
- **Min Stack** → to store the minimum value at each stage

### 🔹 Push Operation
When pushing a value:
1. Push the value into the **main stack**
2. If the **min stack is empty**, push the same value into the min stack
3. Otherwise, compare:
   - Current value
   - Top of min stack (previous minimum)
4. Push the **smaller of the two** into the min stack

This way, the min stack always keeps track of the minimum **up to that position**.

### 🔹 Pop Operation
When popping:
- Remove the top element from **both stacks**

This keeps both stacks synchronized.

### 🔹 Top Operation
Return the top element of the **main stack**.

### 🔹 Get Minimum Operation
Return the top element of the **min stack**, which always stores the current minimum.

---

## Why This Works

The min stack stores the minimum value at every step.  
So even if the minimum element is removed from the main stack, the previous minimum is already stored below it in the min stack.

This allows all operations to work in **O(1) time**.

---

## ⏱ Time Complexity

| Operation | Time |
|-----------|------|
| push()    | O(1) |
| pop()     | O(1) |
| top()     | O(1) |
| getMin()  | O(1) |

---

## Space Complexity

O(n) because we are using an extra stack to store minimum values.

---

## What I Learned

- A single stack is not enough to track minimum after pops
- Using an **extra stack** can help store historical minimum values


