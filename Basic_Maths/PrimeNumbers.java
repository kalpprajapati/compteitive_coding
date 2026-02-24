/* # Check if a number is prime or not

Problem Statement: Given an integer N, check whether it is prime or not. 
A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

Examples

Example 1:
Input:N = 2    
Output:True          
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                        
Example 2:
Input:N =10                   
Output: False            
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.*/
class Solution {
    
    public boolean checkPrime(int n) {
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){ //for(int i=1;i*i<=n;i++) both are same
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
            
        }
        return cnt==2;
    }
}

public class PrimeNumbers{
    public static void main(String[] args) {
        int n = 1483;  // Example number
        Solution obj = new Solution();
        boolean isPrime = obj.checkPrime(n);  // Function call to check if the number is prime

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
// #output : 1483 is a prime number