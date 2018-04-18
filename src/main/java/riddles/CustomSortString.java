package riddles;

import org.testng.annotations.Test;

import java.util.HashMap;

public class CustomSortString {
 /*
 S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

S was sorted in some custom order previously. We want to permute the characters of T so that they
match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur
before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.
  */


    private String customSortString(String S, String T) {

        // 1 - split S to charArray
        // 2 - parse T and make a HashMap out of it - key(char), val(qty)
        // 3 - create array "solution"
        // 4 - iterate S and populate "solution" according to chars sequence in S

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        HashMap<Character, Integer> m = toHashMap(t);
        StringBuilder solution = new StringBuilder();

        for (char c:s) {
            int v = m.get(c);



            while (v > 0) {
                solution.append(c);
                v--;
            }
        }
        return solution.toString();
    }
    
    private HashMap<Character, Integer> toHashMap(char[] t) {
        
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c: t) {
            int val = 1;
            if (!m.containsKey(c)) {
                m.put(c, val);
            }
            else m.put(c, m.get(c) + 1);
        }
        return m;
    } 


    @Test
    public void test() {

        customSortString("cba", "dccccaaabbb");
    }


}