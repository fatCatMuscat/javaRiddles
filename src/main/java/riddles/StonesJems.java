package riddles;/*
You're given strings J representing the types of stones that are jewels,
and S representing the stones you have.  Each character in S is a type of stone you have.

You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Input: J = "aA", S = "aAAbbbb"
Output: 3

Input: J = "z", S = "ZZ"
Output: 0

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

 */

public class StonesJems {

    public static int numJewelsInStones(String J, String S) {

        int solution = 0;

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) solution++;
            }
        }
        return solution;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones("hT", "lkhjT"));
    }






}
