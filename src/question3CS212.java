import java.lang.reflect.Array;
import java.util.Arrays;

class testingCode {

    public static void main(String[] args) {

        String s = "Hello";
        int a[][] = {{1,2,3,4}, {0,1,2,3}};
        int b[] = {3,1,4,1};
        int x = 1, y = 2;

        // (a) Returns true if at least one of x and y is positive. Here "Yes" is printed.
        if (positive(x,y)) System.out.println("Yes");

        // (b) Return the sum of the first row. Here 10 is printed.
        System.out.println(rowSum(a));

        // (c) Return the smallest element. Here 1 is printed.
        System.out.println(smallest(b));

        // (d) Remove the first letter. Here "ello" is printed.
        System.out.println(removeFirst(s));

        // (e) Insert an 'X' at the specified position. Here "HeXllo" is printed.
        s = addX(s, 2);
        System.out.println(s);

    }
    // (a)
    private static boolean positive(int x, int y) {
        // Declares a boolean variable to return later.
        boolean state = false;
        // Checks if either x or y is positive (greater than 0), changes "state" to true if so.
        if (x > 0 || y > 0) state = true;
        // Returns the result of "state".
        return state;
    }
    // (b)
    private static int rowSum(int[][] a) {
        // Declares an integer variable to hold the sum value.
        int sum = 0;
        /* Iterates, from left to right (which uses 'j' instead of 'i'), in the 2D array to add the first
        group of values. */
        for (int j = 0; j < 4; j++) {
            // Adds each value to "sum".
            sum = sum + a[0][j];
        }
        // Returns the final result of "sum".
        return sum;
    }
    // (c)
    private static int smallest(int[] b) {
        // Sorts array "b" automatically from smallest to largest.
        Arrays.sort(b);
        // Returns the first value of array "b", which is 1.
        return b[0];
    }
    // (d)
    private static String removeFirst(String s) {
        /* Makes a StringBuilder variable to hold the original string, allowing the use of different syntax
        that can properly edit the string. */
        StringBuilder x = new StringBuilder(s);
        // Deletes the first letter of "Hello".
        x = x.deleteCharAt(0);
        // Returns the result of the deletion.
        return s = x.toString();
    }
    // (e)
    private static String addX(String s, int i) {
        /* Makes a StringBuilder variable to hold the original string, allowing the use of different syntax
        that can properly edit the string. */
        StringBuilder x = new StringBuilder(s);
        // Inserts the character 'X' at position 'i'.
        x = x.insert(i, 'X');
        // Returns the result of the insertion, "HeXllo".
        return x.toString();
    }
}
