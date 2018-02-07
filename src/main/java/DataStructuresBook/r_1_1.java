package DataStructuresBook;

import java.util.Scanner;

public class r_1_1 {

    public static void inputAllBaseTypes() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any character: ");
        char ch = input.next().charAt(0);

        System.out.println("Enter any number: ");
        int i = input.nextInt();

        System.out.println("Enter a float: ");
        float f = input.nextFloat();

        System.out.println("Enter a boolean: ");
        boolean b = input.nextBoolean();

        System.out.println("Your char is " + ch + "; \n" + "Your int is: " + i + "; \n" + "Your float was: " + f + "; \n" +
        "Your boolean of choice: " + b + ";");

    }


    public static void main(String[] args) {
        inputAllBaseTypes();
    }


}
