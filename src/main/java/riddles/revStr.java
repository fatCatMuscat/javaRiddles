package riddles;

public class revStr {

    public static String reverseString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {

            sb.append(s.charAt(i));

        }

        return sb.toString();

    }


    public static void main(String[] args) {

        System.out.println(reverseString("baRashka"));


    }

}


