package riddles;

import org.testng.annotations.Test;

public class RansomNote {

 /*
 Given an arbitrary ransom note string and another string containing letters
 from all the magazines, write a function that will return true if the ransom
 note can be constructed from the magazines ; otherwise, it will return false.

    Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true



public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;

        int[]note = new int[26];
        int[]mag = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            note[ransomNote.charAt(i) - 'a']++;
        }


        for (int i = 0; i < magazine.length(); i++) {
            mag[magazine.charAt(i) - 'a']++;
        }


        for (int i = 0; i < 26; i++) {
            if (note[i] > mag[i]) return false;
        }
        return true;
    }
  */


    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;

        int[]mag = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            mag[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--mag[ransomNote.charAt(i) - 'a'] < 0) return false;
        }

        return true;
    }


    @Test
    public void test() {



        System.out.println(canConstruct("lorry", "lorrrrry"));

    }

}
