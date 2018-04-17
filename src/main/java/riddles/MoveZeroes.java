package riddles;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZeroes {

    int[] nums = {0,44,0,1,2,0,0,0};

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test() {
        moveZeroes(nums);
    }

}
