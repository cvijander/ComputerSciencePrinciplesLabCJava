// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String [] myArray = new String[]{"Doug", "Mike", "Janet", "Mett"};

        for (String element: myArray)
            System.out.println(element);


        myArray[0] ="Tim";

        for (String element: myArray)
            System.out.println(element);

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Rocket");
        myList.add("Scout");
        System.out.println(myList);

        for (String element:myList)
            System.out.println(element);
        System.out.println(myList.size());


        myList.add(1,"Hoover");
        System.out.println(myList);

        myList.remove("Scout");
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);


    }
}