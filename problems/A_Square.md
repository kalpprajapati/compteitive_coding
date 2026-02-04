A. Square? — Codeforces Problem
## Problem Summary

You are given 4 sticks with lengths a, b, c, and d.
You cannot break or bend the sticks.

Your task is to determine whether it is possible to form a square using all four sticks.

## A square must have:

- 4 sides
- All sides equal in length
- No overlapping or crossing edges

## Input

- First line: Integer t — number of test cases
- For each test case: Four integers a, b, c, d (stick lengths)

Constraints:

- 1 ≤ t ≤ 10⁴
- 1 ≤ a, b, c, d ≤ 10

## Output

For each test case, print:

- "YES" → If the sticks can form a square
- "NO" → Otherwise

Output is case-insensitive (yes, YES, yEs all valid).

## Key Logic

To form a square:
- All four sticks must be exactly the same length
So we simply check:

-> a == b == c == d

If true → print YES
Else → print NO

## Approach

1. Read number of test cases
2. For each test case:
    - Read 4 stick lengths
    - Check if all are equal
    - Print result
Time Complexity per test case: O(1)
Very efficient even for 10,000 test cases.

## Example
Input
7
1 2 3 4
1 1 1 1
2 2 2 2
1 2 1 2
1 1 5 5
5 5 5 5
4 10 5 9

Output
NO
YES
YES
NO
NO
YES
NO

## Final Takeaway

- If all four sticks are equal → Square possible 
- If not → Square impossible 