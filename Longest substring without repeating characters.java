Problem : https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1596438590/
//Java code
TC =
SC =
Solution :
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        Set<Character> seen=new HashSet<>();
        int max=0;
        while(right<s.length()) {
            char c=s.charAt(right);
            if(seen.add(c)) {
                max=Math.max(max,right-left+1);
                right++;
            }
            else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
