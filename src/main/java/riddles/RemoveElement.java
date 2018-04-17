package riddles;

import org.testng.annotations.Test;

public class RemoveElement {

    private int[] nums = {1,2,5,4,0,0,33,0,15};


    public int removeElement(int[] nums, int val) {

        int insertPos = 0;
        int answer;

        for (int num : nums)  {
            if (num != val)  nums[insertPos++] = num;
        }
        answer = insertPos;
        while (insertPos < nums.length) {
            nums[insertPos++] = val;
        }
        return answer;
    }

    @Test
    public void test() {
        removeElement(nums, 0);
    }



}
