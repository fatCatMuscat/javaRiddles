package riddles;

import org.testng.annotations.Test;

public class maxSubarray {

    // Using KADANE's algorithm which says that
    // max local_max == either local_max + A[i] || A[i]
    // So we're storing var local_max and global_max,
    // Updating local_max with each index of iterator and if it's larger than globalMax - we're updating
    // global max too.


    public int kadane(int[] sequence) {
        int local_max = sequence[0] , max_global = sequence[0];
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] < local_max + sequence[i]) {
                local_max = local_max + sequence[i];
            }
            else {
                local_max = sequence[i];
            }
            if (local_max >= max_global) max_global = local_max;
        }
        return max_global;
    }

    @Test
    public void test() {

        System.out.println(kadane(new int[]{-1,4,3,-2,-1}));

    }


}
