// A runs successfully; however, it should have "x = x + 1" to remove the possibility of an endless loop.
class Exercise1b {

    public static void main(String[] args) {

        int x = 1;
        while (x < 10) {
            //Added to avoid endless loop
            x = x + 1;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }

}

/* B does not run, as there is no class declared.
    public static void main(String[] args) {

        int x = 5;
        while (x > 1) {

            x = x - 1;
            if (x < 3 ) {
                System.out.println("small x");
            }

        }

    }
*/

/* C does not run, as there is no main() method.
    class Exercise1b {

        int x = 5;
        while (x > 1) {

            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }

        }

    }
*/