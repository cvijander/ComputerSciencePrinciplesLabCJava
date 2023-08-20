// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    // create the score variable for the game
    public static  int myScore;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Create a variable
        myScore = 1000;

        changeScore();
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        }
     // change the score of the game and output to the console
        public  static void changeScore()
        {
            myScore = myScore + 100;
            System.out.println("Player score: " +myScore);

        }
    }
