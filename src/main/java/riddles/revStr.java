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

    public String reverseString2(String s) {
        char[] charArray = s.toCharArray();
        char[] charArray_2 = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray_2[charArray_2.length-i-1] = charArray[i];
        }
        return new String(charArray_2);
    }


}



