Two Sum – Beginner Friendly Explanation (Java)
## problem Summary

We are given:

An integer array nums

An integer target

We must find two different numbers in the array whose sum equals the target and return their index positions.

# We return indices, NOT the numbers.

## My Understanding in Simple Words

We need to check every possible pair of numbers in the array and see which pair adds up to the target.

When we find the correct pair:

Save their index positions

Return those two indices

The problem guarantees:

Exactly one solution

We cannot use the same element twice

## Approach I Used (Brute Force)

I used two loops to compare each number with the numbers after it.

Step-by-step Logic

Create an array of size 2 to store the answer (indices).

Use the first loop to pick the first number.

Use the second loop to pick the second number.

Check if their sum equals the target.

If yes:

Store their indices in the new array

Stop checking further

Return the array containing the two indices.
Important Points I Learned

- target is a single number, not an array
- We must use nums.length in loops
- We return indices, not values
- We must not use the same index twice
- Second loop starts from i + 1 to avoid repeating pairs

## Time Complexity

This solution checks every pair.

Time Complexity: O(n²)
(Good for learning, not the most optimized)

## What I Learned

-This problem helped me understand:

-How nested loops work

-How to compare pairs in an array

-Difference between returning values vs indices

-How to store and return results using arrays