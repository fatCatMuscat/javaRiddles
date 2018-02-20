package riddles;

public class isPalindrome {

    public static boolean isPali(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) == string.charAt(j)) {
                i++; j--;
            } else return false;
        }
        return true;
    }

    public static boolean isPaliInt (int x) {
         // x = 1234321

        int originalInput = x;
        int result = 0;

        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return originalInput == result;
    }


    public static void main(String[] args) {
        System.out.println(isPaliInt(456787654));
    }






}
