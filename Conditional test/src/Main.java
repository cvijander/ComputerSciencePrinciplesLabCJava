// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how

        // write your code here

        boolean knowJava =true;

        System.out.println("The value of knowJava is " +knowJava);

        if(knowJava)
        {
            System.out.println("I know Java!");
        }

        if (knowJava)
            System.out.println("I still know Java!");

        int myValue = 5;
        System.out.println("myValue is equal to 5");

        if (myValue == 5)
        {
            System.out.println("The condition (myValue == 5) is true");
        }

        if (myValue <5)
        {
            System.out.println("This condition (myValue < 5 ) is true");
        }
        else
        {
            System.out.println("This condition (myValue < 5 ) is false ");
        }

        if(myValue != 5)
        {
            System.out.println("This condition (myValue !=5) is true ");
        }
        else if(myValue > 5)
        {
            System.out.println("This condition (myValkue >5) is true");
        }
        else
        {
            System.out.println("All conditions are false.");
        }

        if(myValue >= 1)
        {
            System.out.println("This condition (myValue >=1) is true");
            if (myValue <= 5 )
            {
                System.out.println("This condition (myValue <= 5) is true");
            }
        }




    }
}