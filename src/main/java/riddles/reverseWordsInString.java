package riddles;

import org.testng.annotations.Test;

public class reverseWordsInString {


    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sbWord = new StringBuilder();
        StringBuilder sbSolution = new StringBuilder(s.length());


        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sbWord.append(word.charAt(i));
            }
            word = sbWord.append(" ").toString();
            sbSolution.append(word);
            sbWord = sbWord.delete(0, sbWord.length());

        }

        System.out.println(String.valueOf(sbSolution));
        return sbSolution.toString().trim();
    }

    @Test
    public void test() {
        reverseWords("ehhehe eheh eheh eh");
    }


}
