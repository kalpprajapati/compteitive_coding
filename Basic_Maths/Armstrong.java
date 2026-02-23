/* # Check if the Number is Armstrong

You are given an integer n. You need to check whether it is an armstrong number or not. 
Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Example 1
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Example 2
Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.*/
public class Armstrong{
    public boolean isArmstrong(int n) {
        int sum=0;
        int dup=n;
        int k=String.valueOf(n).length(); // convert integer to String 
        while(n>0){
            int last=n%10;
            sum+=Math.pow(last,k); //last^k
            n=n/10;    
        }
        return sum==dup;

    }
    public static void main(String[] args) {
        int n=371;
        Armstrong pd=new Armstrong();
        if(pd.isArmstrong(n)){
            System.out.println(n+" is a Armstrong number");
        }else{
            System.out.println(n+" is not a Armstrong number");
        }
    }
}