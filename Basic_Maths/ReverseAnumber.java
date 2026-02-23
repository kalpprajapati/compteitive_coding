/* # Reverse Digits of A Number

Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.

Examples
Input: N = 12345
Output:54321
Explanation: The reverse of 12345 is 54321.

Input: N = 7789                
Output: 9877
Explanation: The reverse of number 7789 is 9877.*/
public class ReverseAnumber{
    public int reversenumber(int x){
        int rev=0;
        while(x!=0){
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            int lastdigit=x%10;
            rev=(rev*10)+lastdigit;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseAnumber obj=new ReverseAnumber();
        int n=12345;
        System.out.println(obj.reversenumber(n));
    }
}