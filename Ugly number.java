Problem : https://leetcode.com/problems/ugly-number/submissions/1595430343/?envType=problem-list-v2&envId=math
//Java code
TC = O(log n)
SC = O(1)
Solution :
class Solution {
    public boolean isUgly(int n) {
        if(n<1)
        return false;
        while (n%2==0)
        n=n/2;
        while (n%3==0)
        n=n/3;
        while (n%5==0)
        n=n/5;
        return n==1;
    }
}
