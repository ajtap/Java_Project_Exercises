// The code here is not able to be used in this problem; extra?

/*
    if (a.contains("two")) {
        a.add("2.2");
    }
 */

//Imports the utility package.
import java.util.*;

class ArrayListMagnet {

    public static void main(String[] args) {
        //Creates a new ArrayList to hold String values.
        ArrayList<String> a = new ArrayList<String>();

        //Adds different values to the ArrayList "a".
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        //Calls on method printAL with argument "a".
        printAL(a);
        //Removes the current value at index 2, which is string "two".
        a.remove(2);

        //Adds string "four" if string "three" exists, which sorts "four" to index 3.
        if (a.contains("three")) {
            a.add("four");
            //Calls on method printAL with argument "a".
            printAL(a);
        }

        //If string "four" is not at index 4, then add string "4.2" to index 4.
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
            //Calls on method printAL with argument "a".
            printAL(a);
        }

        //Calls on method printAL with argument "a".
        //(Prints "zero  one  three  four  4.2" twice.)
        printAL(a);
    }

    //Method used to print the values within the given ArrayList<String>.
    public static void printAL(ArrayList<String> al) {

        //Iterates through each value in ArrayList "a".
        for (String element : al) {
            //Prints the current values within ArrayList "a".
            System.out.print(element + "  ");
        }
        //Creates a new line.
        System.out.println(" ");
    }
}
