/*1979. Find Greatest Common Divisor of Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

 

Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
Example 3:

Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
 

Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000*/

// # Pseudocode — Find GCD of Smallest and Largest in Array
/*START

INPUT array nums

SET min ← nums[0]
SET max ← nums[0]

FOR each element x in nums (from index 1 to end)
    IF x < min THEN
        min ← x
    ENDIF

    IF x > max THEN
        max ← x
    ENDIF
END FOR


FOR i ← minimum(min, max) DOWNTO 1
    IF (min MOD i = 0) AND (max MOD i = 0) THEN
        RETURN i
    ENDIF
END FOR

RETURN 1

END*/
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=Math.min(min,max);i>0;i--){
            if(min%i==0 && max%i==0){
                return i;
            }
        }
        return 1;
        
    }
}