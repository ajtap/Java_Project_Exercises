class Shuffle1 {

    public static void main(String[] args) {
        // Declares x int variable.
        int x = 3;

        // While loop to run statements as long as x > 0.
        while (x > 0) {
            // If x > 2, print "a".
            if (x > 2) {

                System.out.print("a");

            }
            // If x == 2 (on second run/first loop), print "b c".
            if (x == 2) {

                System.out.print("b c");
            }
            /* If x == 1 (on third run/second loop), print "d". Ends the loop to prevent another "-" from printing
            (In the textbook, it says to use:
                x = x - 1
            to end the while loop; however, this still prints out an extra hyphen. */
            if (x == 1) {

                System.out.print("d");

                break;

            }
            // Subtract a value from x and prints "-". Loops through afterwards.
            x = x - 1;
            System.out.print("-");
        }
    }
}