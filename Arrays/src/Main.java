// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String [] myArray = new String[] {"Doug", "Matt", "Janet", "Mike"};

        System.out.println(myArray[0]);

      //  System.out.println(myArray[4]);

        for(int i =0; i<myArray.length; i++)
        {
            System.out.println("Hello, " + myArray[i]);
        }


        for (String element: myArray) {
            System.out.println("Good bye, " + element);

        }


    }
}