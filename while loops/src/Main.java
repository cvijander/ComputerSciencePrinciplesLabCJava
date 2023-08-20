// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int myValue =0;

        while (myValue < 100)
        {
            if(myValue % 9 ==0)
            {
                System.out.println(myValue);
            }

            myValue++;
        }


        int myBadValue =0;
        do {
            System.out.println("This will run at least once.");
        } while (myBadValue != 0);

    }
}