# 622. Design Circular Queue (Ring Buffer)
🔹 Problem Overview
-> A Circular Queue is a linear data structure that follows:

- FIFO — First In First Out
- The last position connects back to the first position
- Efficient use of space (unlike normal queue)

In a normal queue, empty space at the front cannot be reused.
In a circular queue, that space can be reused.

## Key Operations
Operation	    Description
enQueue(value)	Insert element
deQueue()	    Remove element
Front()	        Get first element
Rear()	        Get last element
isEmpty()	    Check if empty
isFull()	    Check if full

## Data Members Used

queue[] → array to store elements
size    → capacity of queue
front   → index of first element
rear    → index of last element

## Initial State:

front = 0
rear  = -1

## Concept of Circular Behavior
Index moves using:

-> (index + 1) % size

This wraps the pointer to the beginning.

## Pseudocode
🔹 Constructor
FUNCTION MyCircularQueue(k)
    size ← k
    queue ← new array of size k
    front ← 0
    rear ← -1
END FUNCTION
🔹 enQueue(value)
FUNCTION enQueue(value)

    IF isFull() THEN
        RETURN false
    END IF

    rear ← (rear + 1) MOD size
    queue[rear] ← value

    RETURN true
END FUNCTION
🔹 deQueue()
FUNCTION deQueue()

    IF isEmpty() THEN
        RETURN false
    END IF

    IF front == rear THEN
        front ← 0
        rear ← -1
    ELSE
        front ← (front + 1) MOD size
    END IF

    RETURN true
END FUNCTION
🔹 Front()
FUNCTION Front()

    IF isEmpty() THEN
        RETURN -1
    END IF

    RETURN queue[front]
END FUNCTION
🔹 Rear()
FUNCTION Rear()

    IF isEmpty() THEN
        RETURN -1
    END IF

    RETURN queue[rear]
END FUNCTION
🔹 isEmpty()
FUNCTION isEmpty()

    IF rear == -1 THEN
        RETURN true
    ELSE
        RETURN false
    END IF
END FUNCTION
🔹 isFull()
FUNCTION isFull()

    IF NOT isEmpty() AND (rear + 1) MOD size == front THEN
        RETURN true
    ELSE
        RETURN false
    END IF
END FUNCTION

## Time Complexity
All operations are:

 O(1) — Constant Time

No shifting of elements required.

## Why Circular Queue is Better than Normal Queue?

- Reuses empty space
- No memory wastage
- Faster operations
- Used in buffers, scheduling, streaming