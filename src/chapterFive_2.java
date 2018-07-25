class MultiFor {

    public static void main(String[] args) {
        //Loops through this for loop body while x < 4.
        for(int x = 0; x < 4; x++) {
            //Runs through this for loop twice (while y > 2 when y = 4) for every one loop of the x for loop.
            for(int y = 4; y > 2; y--) {
                // Print out the below statement .
                // (Prints current value of x with y as 4, then with y as 3 on a new line.)
                System.out.println(x + " " + y);

            }
            // Once x is equal to 1, skip the value of 2 and change x from 1 to 3.
            if (x == 1) {
                x++;
            }
        }
    }
}
