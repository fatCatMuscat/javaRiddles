package riddles;

import org.testng.annotations.Test;

import java.util.Arrays;

public class mergeSortedArrays {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0 || nums2.length == 0) return nums1;
        if (m == 0 || nums1.length == 0) return nums2;


        int count = m;

        for (int i : nums2) {
            nums1[count++] = i;
        }

        for (int i = m - 1; i < nums1.length - 1; i++) {

            if (nums1[i] > nums1[i + 1]) {
                swap(nums1, i);
            }
        }
        return nums1;
    }

    public int[] swap(int[] nums, int i) {

        int temp = nums[i + 1];
        nums[i + 1] = nums[i];
        nums[i] = temp;

        return nums;
    }



    @Test
    public void test() {

        int nums1[] = {0};
        int nums2[] = {1};

        System.out.println(Arrays.toString(merge(nums1, 0, nums2, 1)));
    }



}


