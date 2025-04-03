Problem : https://leetcode.com/problems/find-the-difference/
//java code
TC = O(n)
SC = O(1)
Solution :
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }
}  
