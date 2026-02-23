/* # Divisors of a Number

You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.

Example 1
Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.

Example 2
Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.*/
import java.util.*;

class Solution {
    
     public List<Integer> getDivisors(int N) {
        // Create a list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                
                res.add(i);

                // If N / i is different from i, add N / i too
                /*Why √N approach is used?

                    Divisors come in pairs:

                    Example: 36
                    1 × 36
                    2 × 18
                    3 × 12
                    4 × 9
                    6 × 6

                    After √N, pairs repeat.
                    So checking only till √N gives ALL divisors.*/
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        Collections.sort(res);
        return res;

    }
    }
public class PrintDivisor{
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        int N = 36;
        List<Integer> result = sol.getDivisors(N);
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}