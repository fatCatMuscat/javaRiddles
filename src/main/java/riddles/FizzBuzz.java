package riddles;


/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for
the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 */


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> solution = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) solution.add("FizzBuzz");
            else if (i % 3 == 0) solution.add("Fizz");
            else if (i % 5 == 0) solution.add("Buzz");
            else solution.add(String.valueOf(i));
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(1));
    }






}
