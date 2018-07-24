class PartyHandshakes {

    public static void main(String[] args) {

        int n = 10;
        int total_handshakes = n;

        System.out.println("There are " + n + " people at the party.");
        for (int i = n - 1; i > 0; i--) {
            total_handshakes = total_handshakes + i;
            System.out.println(i);
        }
        System.out.println("There were " + total_handshakes + " handshakes at the party.");
    }
}

