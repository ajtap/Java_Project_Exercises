// Reversing the string "The quick brown fox".

public class project1_1 {

    public static void main (String[] args) {

        String original = "The quick brown fox";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);
    }
}
