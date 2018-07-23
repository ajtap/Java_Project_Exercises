// Prints out the result of each expression separately on the same line.

public class project1_2 {

    public static void main(String[] args) {

        int one = -5 + 8 * 6;
        int two = (55 + 9) % 9;
        int three = 20 + -3 * 5 / 8;
        int four = 5 + 15 / 3 * 2 - 8 % 3;
        int [] results = { one, two, three, four};

        for (int x : results) {
            System.out.print(Integer.toString(x) + " ");
        }
    }
}

