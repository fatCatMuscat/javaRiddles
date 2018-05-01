package riddles;

import org.testng.annotations.Test;

import java.util.HashSet;

public class findDupes {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (!set.add(n)) return false;
        }
        return true;
    }



    @Test
    public void test() {
        System.out.println(containsDuplicate(new int[] {1,2,2}));
    }
}
