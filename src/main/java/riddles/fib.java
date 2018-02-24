package riddles;

import org.testng.annotations.Test;

public class fib {

    /*
        find n'th fib number?
        1,1,2,3,5,8,13....
    */

    @Test
    public void test() {
        System.out.println(fibDyn(15));
        System.out.println(fib(15));
    }


    public int fib(int n) {

        if (n==1 || n==2) return 1;
         else return fib(n - 1) + fib (n - 2);
    }

    public int fibDyn(int n) {

        int[] fibSequence = new int[n];
        fibSequence[0] = 1;
        fibSequence[1] = 1;
        for (int i = 2; i < n; i++) {
        //    System.out.println("-------");
        //    System.out.println(fibSequence[i-1]);
        //    System.out.println(fibSequence[i-2]);
        //    System.out.println("-------");
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence[n - 1];
    }


    @Test
    public void test2() {
        int[] fibSequence = new int[15];
        fibSequence[0] = 1;
        fibSequence[1] = 1;

        fibSequence[2] = fibSequence[2 - 1] + fibSequence[2 - 2];
        System.out.println(fibSequence[2]);
    }

}
