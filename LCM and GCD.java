Problem : https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=1
TC = O(log(min(a,b)))
SC = O(1)
//Java code
Solution : 
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int originalA=a,originalB=b;
     while(b!=0){
         int temp=b;
         b=a%b;
         a=temp;
     }
     int gcd=a;
     int lcm=(originalA/gcd)*originalB;
     return new int[]{lcm, gcd};
    }
}
