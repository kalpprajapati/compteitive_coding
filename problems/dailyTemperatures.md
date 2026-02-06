## Daily Temperatures — Monotonic Stack Approach (Java)

This problem asks:
    - For each day, how many days must we wait to get a warmer temperature?

If no warmer temperature exists in the future, return 0 for that day.

## Core Idea

We use a Monotonic Stack to efficiently find the next warmer day.

Instead of checking every future day (which is slow), we:

- Move from right to left
- Keep a stack of indices
- Maintain the stack so that temperatures are in a useful order

This helps us find the next warmer temperature in O(n) time.

## Why We Traverse From Right to Left?

Because we want information about the future days.
When we are at index i, the stack already contains only future days.

## What Does the Stack Store?

The stack stores indices of days, not temperatures.
We use indices so we can:

- Compare temperatures → temp[index]
- Calculate number of days difference → nextIndex - currentIndex

## Algorithm Steps

For each day from right to left:

1. Remove all indices from the stack whose temperature is less than or equal to the current day's temperature.

2. If the stack becomes empty → there is no warmer day → answer is 0.

3. Otherwise, the top of the stack is the next warmer day.

4. Push the current index into the stack.

## Final Stack Remaining After Loop

Stack (bottom → top) = [6, 2, 1, 0]

These are indices of temperatures:
Index	Temperature
6	    76
2	    75
1	    74
0	    73

Top of stack = 0

## Time & Space Complexity

Time Complexity: O(n)
Each index is pushed and popped at most once.

Space Complexity: O(n)
For stack and result arrays.

## Key Takeaway

This is a classic Next Greater Element pattern using a monotonic stack.
Mastering this pattern helps in many problems like:

- Next Greater Element
- Stock Span
- Trapping Rain Water