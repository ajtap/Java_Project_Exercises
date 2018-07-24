import java.lang.reflect.Array;
import java.util.Arrays;

class testingCode {

    public static void main(String[] args) {

        String s = "Hello";
        int a[][] = {{1,2,3,4}, {0,1,2,3}};
        int b[] = {3,1,4,1};
        int x = 1, y = 2;

        if (positive(x,y)) System.out.println("Yes");

        System.out.println(rowSum(a));

        System.out.println(smallest(b));

        System.out.println(removeFirst(s));

        s = addX(s, 2);
        System.out.println(s);

    }

    private static boolean positive(int x, int y) {
        boolean state = false;
        if (x > 0 || y > 0) state = true;
        return state;
    }

    private static int rowSum(int[][] a) {

        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum = sum + a[0][j];
        }
        return sum;
    }

    private static int smallest(int[] b) {

        Arrays.sort(b);
        return b[0];
    }

    private static String removeFirst(String s) {

        StringBuilder x = new StringBuilder(s);
        x = x.deleteCharAt(0);
        return s = x.toString();
    }

    private static String addX(String s, int i) {

        StringBuilder x = new StringBuilder(s);
        x = x.insert(i, 'X');
        return x.toString();
    }
}
