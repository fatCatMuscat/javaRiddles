package riddles;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class morseCode {
    final private String[] MORSEALPHABET = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
            "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    private String transformToMorseCode(String word) {
        StringBuilder wordInMorse = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordInMorse.append(MORSEALPHABET[word.charAt(i) - 'a']);
        }
        return wordInMorse.toString();
    }

    private int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>(words.length);

        for(String word: words) {
            if (set.contains(transformToMorseCode(word))) continue;
            else set.add(transformToMorseCode(word));
        }

        System.out.println(set.toString());
        return set.size();

    }

    @Test
    public void test1() {

        System.out.println(uniqueMorseRepresentations(words));


    }

    private String[] words = {"lol", "lol", "lol"};





}
