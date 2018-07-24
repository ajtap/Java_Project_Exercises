class PartyHandshakes {

    public static void main(String[] args) {
        // Declares var 'n' for the number of people (set to 10) and var
        // 'total_handshakes' for the total amount of handshakes (set to 'n' for iteration purposes).
        int n = 10;
        int total_handshakes = n;

        // Prints the # of people.
        System.out.println("There are " + n + " people at the party.");
        // This 'for' loop uses var 'i' to slowly increase the total number of handshakes similarly to
        // a factorial function (however, instead of multiplying we are adding the handshakes).
        for (int i = n - 1; i > 0; i--) {
            total_handshakes = total_handshakes + i;
            // Prints value of 'i' through each loop for testing.
            System.out.println(i);
        }
        // Prints the result amount of handshakes, 55        /* Makes a StringBuilder variable to hold the original string, allowing the use of different syntax
        //        that can properly edit the string. */
        System.out.println("There were " + total_handshakes + " handshakes at the party.");
    }
}

