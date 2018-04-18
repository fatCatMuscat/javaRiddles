package riddles;

import org.testng.annotations.Test;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word.length() < 2) return true;
        System.out.println(word.substring(1));
        if (word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        if (word.toUpperCase().equals(word)) return true;
        return false;

    }


    @Test
    public void test() {

        System.out.println(detectCapitalUse("ggg"));

    }




}
