package riddles;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

/*
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
 */

    public int findPairs(int[] nums, int k) {

        if (nums.length == 0 || nums == null || k < 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) count++;
            }
            else {

                if (map.containsKey(entry.getKey() + k)){
                    count++;
                    System.out.println( count);
                }
            }
        }

        return count;
    }


    @Test
    public void test() {

        findPairs(new int[] {1,3,1,5,4}, 0);




    }



}
