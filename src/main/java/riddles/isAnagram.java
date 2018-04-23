package riddles;

import org.testng.annotations.Test;

import java.util.Arrays;

public class isAnagram {

    public boolean isAnagram(String s, String t) {

        //  count qty of chars in a string s and t
        // if qty is equal = return true; else, return false

        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char ch : s.toCharArray()) {
            countS[ch - 'a']++;
        }
        System.out.println(Arrays.toString(countS));
        for (char ch : t.toCharArray()) {
            countT[ch - 'a']++;
        }
        System.out.println(Arrays.toString(countT));
        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) return false;
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isAnagram("bobbak", "bbboa"));
    }



}
