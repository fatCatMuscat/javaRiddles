package riddles;

import org.testng.annotations.Test;

public class reverseInt {

    public int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            System.out.println("tail = " + tail);
            int newResult = result * 10 + tail;
            System.out.println("new result = " + newResult);
           // System.out.println((newResult - tail) / 10);
          //  if ((newResult - tail) / 10 != result)
            //{ return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }


    @Test
    public void test() {
        reverse(123);
    }
}
