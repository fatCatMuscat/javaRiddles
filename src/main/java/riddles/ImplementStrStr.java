package riddles;

import org.testng.annotations.Test;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        int l = needle.length();

        if (l == 0 || haystack.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + l > haystack.length()) return -1;
                String sub = haystack.substring(i, i + l);
                if (sub.equals(needle)) return i;
            }

        }
        return -1;
    }

    @Test
    public void test() {


        System.out.println(strStr("mississippi", "issipi"));

    }





}
