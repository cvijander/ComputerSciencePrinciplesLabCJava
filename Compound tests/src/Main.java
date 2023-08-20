// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        if (true || false)
        {
            System.out.println("Only one value needs to be tru in an OR statement for the whole evaluation");
        }

        if(true && false)
        {
            //
        }
        else
        {
            System.out.println("Both values need to be true for an AND statement to be true");
        }

        int myMaxLimit =20;
        int myMinLimit =5;
        int myValue =10;

        if(myValue< myMaxLimit && myValue > myMinLimit)
        {
            System.out.println("The value " + myValue + " is between " + myMinLimit + " and " + myMaxLimit);
        }
        else
        {
            System.out.println("The value " +myValue + "is not between " + myMinLimit + " and " + myMaxLimit) ;
        }


        int myMaxXLimit =5;
        int myMinXLimit =1;
        int myMaxYLimit =3;
        int myMinYLimit =1;

        int myXValue =6;
        int myYValue =2;

        if((myXValue < myMaxXLimit && myXValue > myMinXLimit) && (myYValue <myMaxYLimit && myYValue > myMinYLimit))
        {
            System.out.println("Both the X and Y values are within the limits");
        }
        else
        {
            System.out.println("One or both of the X and Y values are outside of the limits");
        }

        boolean myBoolean =false;
        if(!myBoolean)
        {
            System.out.println("Not false is " +myBoolean);
        }




    }
}