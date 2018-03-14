package CollectionsLearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {


    public static List<Integer> plusOne(List<Integer> A) {

        //add 1 to an array of integers like {1,2,3} - output - {1,2,4}

        int n = A.size() - 1; // n = qty of elements
        A.set(n, A.get(n) + 1); // adding 1 to last int

        for (int i = n; i > 0 && A.get(i) == 10; i--) {  //iterating from end to beginning
                A.set(i, 0); // if i = 10 we change it with 0
                A.set(i - 1, A.get(i - 1) + 1); // and prev int add 1
            }
            if (A.get(0) == 10) { // if the first int appears to become 10
            A.set(0, 10); // we add 0 to the end and set 1st int to 1
            A.add(0);
        }
        return A;
    }





    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (int i : numbers) System.out.println(i);





    }




}
