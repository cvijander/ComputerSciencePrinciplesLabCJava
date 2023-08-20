// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int myVariable =5;
        System.out.println("myVariable is equal to " + myVariable + " and is an int.");

        String myString = Integer.toString(myVariable);
        System.out.println("myString is equal to " + myString + " and is a string");

        myString =myString +1;
        myString +=1;

        System.out.println("myString is equal to " + myString + " and is a string");

        myVariable = Integer.parseInt(myString) +1;
        System.out.println("myVariable is equal to " + myVariable + " and is an int.");



    }
    }
