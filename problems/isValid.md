## Valid Parentheses – Stack Approach

This problem checks whether a string of brackets is valid.

A string is valid if:

-Every opening bracket has a matching closing bracket
-Brackets close in the correct order
-No closing bracket appears without a matching opening bracket

Allowed brackets: () {} []

## My Thinking Process

At first, I thought this problem could be solved using only if–else conditions.
But that approach becomes confusing when brackets are nested like:

([])   → valid  
([)]   → invalid

Then I learned we should use a Stack because stack follows LIFO (Last In First Out).
That helps us match the most recent open bracket with the next closing bracket.

## Stack Operations Used

Operation	Purpose

-push	    Store opening brackets
-pop	    Remove matched opening bracket
-peek	    Check the top element of stack
-isEmpty	Check if stack has no elements

## Step-by-Step Logic

1. Create an empty stack
2. Traverse each character of the string
3. If the character is an opening bracket → push into stack
4. If the character is a closing bracket:
    -If stack is empty → return false
    -Otherwise, check top of stack
    -If top matches the closing bracket → pop
    -Else → return false
5. After loop ends:
    -If stack is empty → return true
    -Else → return false

## Pseudocode
create empty stack

for each character ch in string:
    if ch is '(' or '{' or '[':
        push ch into stack
    else:
        if stack is empty:
            return false
        
        top = peek stack
        
        if ch matches top bracket:
            pop stack
        else:
            return false

if stack is empty:
    return true
else:
    return false

## Time & Space Complexity

Complexity	Value

-Time	    O(n) — we traverse string once
-Space	    O(n) — stack may store all opening brackets

## Final Understanding

-Stack helps us always match the latest opening bracket with the current closing bracket.
-If anything mismatches or remains unmatched → string is invalid.
-If everything matches perfectly → string is valid 