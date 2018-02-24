package riddles;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class FirstOccuraneChar {


/*
    given a string of random chars find the first one that has more than 1 occurances
    input: SJKLJADS
    output: S
 */

    public char findChar(String input) {
        Set <Character> set = new HashSet<Character>(input.length());
        for (char ch : input.toCharArray()) {

            if (!set.add(ch)) return ch;

        }
        return '-';
    }

    @Test
    public void test() {
        System.out.println(findChar("asdfghjklkjhl"));
    }



}
