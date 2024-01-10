import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        board = new char[][]{{'X', ' ', ' '},
                             {' ', 'X', ' '},
                             {' ', ' ', 'X'}};

        for (char[] chars : board) {
            for (char character: chars) {
                System.out.print(character);
                System.out.print("|");
            }
            System.out.println("");

        }



    }
}