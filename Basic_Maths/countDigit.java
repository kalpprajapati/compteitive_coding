/* # Count digits in a number

Problem Statement: Given an integer N, return the number of digits in N.

Examples
Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
                        
Example 2:
Input:N = 7789              
Output: 4
Explanation: The number 7789 has 4 digits. */
public class countDigit{

    public static int countdigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n=23425;
        System.out.println("N="+n);
        int digit=countdigit(n);
        System.out.println("Number of digit in N: "+digit);
    }
}