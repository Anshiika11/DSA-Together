# DSA-Together
Problem : https://www.geeksforgeeks.org/problems/count-numbers-divisible-by-m1524/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
solution : 
// Java code 
class Solution {
    static int countDivisibles(int A, int B, int M){
        int div;
        int count=0;
        for(div=A;div<=B;div++){
            if(div%M<=0) 
            {
                count++;
            }
        }
                return count;
        
    }
}
