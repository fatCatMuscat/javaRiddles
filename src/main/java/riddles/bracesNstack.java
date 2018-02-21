package riddles;

import org.testng.annotations.Test;

import java.util.Stack;

public class bracesNstack {

    @Test
    public void isValidTest() {
        String braces = "()((({})))";
        System.out.println(isValid(braces));
    }



    private boolean isValid(String braces) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch: braces.toCharArray()){

            switch (ch) {
                case '(': stack.push(')');
                break;
                case '{': stack.push('}');
                break;
                case '[': stack.push(']');
                break;
                default:
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

}
