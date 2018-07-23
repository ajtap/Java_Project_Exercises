// A will not run successfully due to the lack of declaring new Books() objects for each myBooks[] array variable.
class Books {

    String title;
    String author;
}

class BooksTestDrive {

    public static void main(String[] args) {

        Books [] myBooks = new Books[3];
        int x = 0;
        // Declaring each array value.
        int y = 0;

        while (y < myBooks.length) {
            myBooks[y] = new Books();
            y = y + 1;
        }

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}


// Hobbits[0] is not defined as an object reference, since z = z + 1 is ran first in the while loop and skips 0 index.
// main() method is also in the same class as the object class, which could be optionally moved to a separate class.
class Hobbits {

    String name;

}
// Added second class as main method.
class HobbitsExecution {

    public static void main(String[] args) {

        Hobbits [] h = new Hobbits[3];
        int z = 0;

        while (z < 4) {
            // z = z + 1 was originally here.

            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }
            if(z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name = " is a");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}