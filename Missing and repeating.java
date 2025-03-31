problem : https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
// java code
TC = O(n)
SC = O(n)
solution :
class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        int repeating=-1,missing=-1;
        int[] countArr = new int[n + 1];
        for (int num : arr) {
            countArr[num]++;
        }

        for(int i=1;i<=n;i++)
        {
            if (countArr[i] == 2) {
                repeating = i;
            } else if (countArr[i] == 0) {
                missing = i;
            }
        }
         ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
