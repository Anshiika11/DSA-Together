Problem : https://leetcode.com/problems/maximum-69-number/submissions/1596170736/
//java code
TC =
SC =
Solution :
class Solution {
    public int maximum69Number (int num) {
      int temp=num;
      int idx=0;
      int i=0;
      while(temp>0){
        i++;
        int digit=temp%10;
        temp=temp/10;
        if(digit==6){
            idx=i;
        }
      }
      return num+3*(int)Math.pow(10,idx-1);
    }
}
