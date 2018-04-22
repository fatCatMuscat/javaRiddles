package riddles;

//Given a sorted array nums, remove the duplicates in-place
// such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this by
// modifying the input array in-place with O(1) extra memory.

// [0,0,0,1,1,1,2,2,3,3,4]

/*
1 -  Introduce curVal = A[0];
2 -  Introduce insertPos = A[1]; - assume that 2nd element is duplicate of 1st;
2 -  Iterate A;
        if (A[i] != curVal)
        set curVal = A[i]
        set A[insertPos] = A[i]
        set insertPos = A[i + 1]

 */


import org.testng.annotations.Test;

import java.util.Arrays;

public class removeDupesFromSortedArr {

    public int removeDuplicates(int[] nums) {

        if (nums == null ||  nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int curVal = nums[0];
        int insertPos = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            // 1,1,1,2,2,3,4,4,4
            if (nums[i] != curVal) {
                curVal = nums[i];
                nums[insertPos] = curVal;
                insertPos++; count++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    @Test
    public void test() {

        System.out.println(removeDuplicates(new int[]{1,2,2,4}));

    }





}
