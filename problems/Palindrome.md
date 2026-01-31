## Palindrome Number (Java Solution)

This project contains a Java solution to check whether a given integer is a palindrome number.

A palindrome number is a number that reads the same forward and backward.

## Examples:

121 → Palindrome 

-121 → Not Palindrome 

10 → Not Palindrome 

## Problem Statement

Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome number remains the same when its digits are reversed.

## Approach

We reverse the number mathematically and compare it with the original number.

Steps:

-Store the original number.

-If the number is negative, return false (negative numbers cannot be palindromes).

-Extract digits one by one from the end.

-Build the reversed number.

-Compare the reversed number with the original number.

## Time and Space Complexity
    Complexity	Value
    Time	    O(log₁₀ n)
    Space	    O(1)

✔ We only loop through the digits once
✔ No extra data structures are used

## How It Works (Example)

Let’s take x = 121

Step	x	digit	reversed
1	    121	1	    1
2	    12	2	    12
3	    1	1	    121

## Key Concepts Used

-Modulus operator % to extract last digit

-Integer division / to remove last digit

-Looping

-Number reversal logic