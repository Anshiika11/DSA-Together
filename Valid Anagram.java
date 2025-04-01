Problem : https://neetcode.io/problems/is-anagram (NEETCODE)
Problem : https://leetcode.com/problems/valid-anagram/submissions/1592619804/ (LEETCODE)
TC = O(nlog n)
//java code
Solution : 
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
}
