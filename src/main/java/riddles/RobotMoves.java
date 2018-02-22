package riddles;

import org.testng.annotations.Test;

public class RobotMoves {

    /*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
judge if this robot makes a circle, which means it moves back to the original
place.

The move sequence is represented by a string. And each move is represent by a
character. The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.

Input: "UD"
Output: true
*/

    @Test
    public void testCircle() {
        System.out.println(asciiChar('V'));
    }


    public int asciiChar(char ch) {

        return (int)ch;

    }



    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char ch: moves.toCharArray()) {
            switch(ch) {
                case 'U': y++;
                break;
                case 'D': y--;
                break;
                case 'L': x--;
                    break;
                case 'R': x++;
                    break;
                default: return false;
            }
        }
        return x==0 && y==0;
    }

    public boolean solution(String moves) {

        int [] bin = new int[256];

        for(char ch: moves.toCharArray()) {
            bin[ch]++;
        }
        System.out.println(bin['U'] + ":u, " + bin['D'] + ":d, " + bin['L'] + ":l, " + bin['R'] + ": r");
        return bin['U'] == bin['D'] && bin['L'] == bin['R'];

    }





}
