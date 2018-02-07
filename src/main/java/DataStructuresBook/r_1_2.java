package DataStructuresBook;

public class r_1_2 {

    public static boolean isMultiple(long n, long m, int i) {
        return i == n / m;
    }



    public static boolean isEven(int i) {
        return i % 2 == 0;
    }





    public static void main(String[] args) {
        System.out.println(isEven(30));
    }
}
