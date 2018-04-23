package riddles;

import org.testng.annotations.Test;

import java.util.HashMap;

public class isomorphicStrings {

    /*
    Given two strings s and t, determine if they are isomorphic.
    Two strings are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving
    the order of characters. No two characters may map to the same character but a character may map to itself.
    For example,
    Given "egg", "add", return true.
    Given "foo", "bar", return false.
    Given "paper", "title", return true.
    Note:
    You may assume both s and t have the same length.
    */

    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }else{
                if(!map.containsValue(b))
                    map.put(a,b);
                else return false;

            }
        }
        return true;

    }

    @Test
    public void test() {
        System.out.println(isIsomorphic("aamq","aaca"));
    }

}
