// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    // create the score variable for the game
    public static int outsideValue = 5;

    // main function of the program
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //output variables to the console

        System.out.println("From outside: outsideValue = " + outsideValue);
      //  System.out.println("From outside: functionValue = " + functionValue);
    }

    public  static  void  myFunction()
    {
        //create a variable inside of a function
        int functionValue = 10;

        //output variables to the console
        System.out.println("From outside: outsideValue = " + outsideValue);
        System.out.println("From outside: functionValue = " + functionValue);
    }

    public  static void  myOtherFunction()
    {
        // output variables to the console
        System.out.println("From outside: outsideValue =" +outsideValue);
      //  System.out.println("From outside: functionValue =" +functionValue);

    }
}