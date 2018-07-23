public class project1_5 {

    public static void main(String[] args) {

        String digits = "123456";
        String digits_separated;
        int int_separated;

        for (int i = 0; i <= 5; i++) {
            digits_separated = Character.toString(digits.charAt(i));
            int_separated = Integer.parseInt(digits_separated);

            System.out.print(int_separated);
            System.out.print(" ");
        }
    }
}
