package riddles;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {


    /*
    Rotate an array of n elements to the right by k steps.
    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
     */

    public void rotate(int[] nums, int k) {

        k %= nums.length;

        ArrayList<Integer> sol = new ArrayList<>(nums.length);

        for (int i = nums.length - k; i < nums.length; i++) {
            sol.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            sol.add(nums[i]);
        }

        System.out.println(Arrays.toString(sol.toArray()));

        for (int i = 0; i < sol.size(); i++) {
            nums[i] = sol.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }

    public void rotateTwo (int[] nums, int k) {
        k %= nums.length;
        System.out.println(k %= nums.length);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test() {
        rotate(new int[]{1,2}, 3);
    }

    @Test
    public void testo() {

    }

}
