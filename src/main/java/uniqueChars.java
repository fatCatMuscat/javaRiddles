import java.util.HashMap;

public class uniqueChars {


    private static HashMap<Character, Integer>  testUniqueChars(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int oldVal = map.get(ch);
                oldVal++;
                map.put(ch, oldVal);
            }
        }
        return map;
    }

    private static void  uniqueCharz() {
        String s  = "Hello kukaracha tarakan!";
        HashMap<Character, Integer> map = testUniqueChars(s);

        for(char ch: map.keySet()) {
            int val = map.get(ch);
            System.out.println(ch + " > " + val);
        }
    }


    public static void main(String[] args) {
        uniqueCharz();
    }



}
