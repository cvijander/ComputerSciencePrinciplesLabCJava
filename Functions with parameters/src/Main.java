// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int myScore;

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        myScore = 1000;
        System.out.println("Setting the score to: " +myScore);
        displayScore();
        changeScore(100);
        changeScore(50);
        changeScore(-250);
        changeScore(125);



    }

    public static void changeScore(int scoreDelta) {
        System.out.println("Changing the score by :" +scoreDelta);
        myScore = myScore + scoreDelta;
        displayScore();
    }

    public static void displayScore() {
        System.out.println("Player score: " + myScore);
    }

}
