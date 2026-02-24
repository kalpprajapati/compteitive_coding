/* # Find GCD of two numbers

Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

Examples
Example 1:
Input: N1 = 9, N2 = 12
Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)

Example 2:
Input: N1 = 20, N2 = 15
Output: 5
Explanation:
Factors of 20: 1, 2, 4, 5, 10, 20
Factors of 15: 1, 3, 5, 15
Common Factors: 1, 5
Greatest common factor: 5 (GCD)*/
public class GCD {
    // Continue loop as long as both
    // n1 and n2 are greater than 0
    public static int findGcd(int n1, int n2) {
        while(n1>0 && n2>0){
            if(n1>n2){
                n1%=n2;
            }else{
                n2%=n1;
            }
        }
        if(n1==0){
            return n2;
        }
        return n1;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
    
// #output : GCD of 20 and 15 is: 5                        