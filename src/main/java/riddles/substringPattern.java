package riddles;

import org.testng.annotations.Test;

public class substringPattern {

    //      asdasdasd
    public boolean repeatedSubstringPattern(String s) {

        int l = s.length();

        for (int i = l / 2; i > 0; i--) {

            if (l % i == 0) {
                String sub = s.substring(0, i);
                int m = l / i;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(repeatedSubstringPattern("asdasdasd"));
    }
}
