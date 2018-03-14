package CollectionsLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {

    //input is array of ints. Need to reorder it so even ints appear first.


    public static List<Integer> evenOdd (List<Integer> A) {

        int nextEven = 0;
        int nextOdd = A.size() - 1;

        while (nextEven < nextOdd) {
            if (A.get(nextEven) % 2 == 0) {
                nextEven++;
            }
            else  {
                Collections.swap(A, nextEven, nextOdd);
                nextOdd--;
            }
        }
        return A;
    }

    public static void main(String[] args) {

        List<Integer> A = new ArrayList<Integer>(5);
        A.add(22);
        A.add(5);
        A.add(72);
        A.add(3);
        A.add(4);
        System.out.println(evenOdd(A).toString());
    }


}
