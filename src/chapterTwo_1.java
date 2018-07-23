// Simplified the boolean conditionals at the end of each TestDrive() class.

// A cannot run properly, since the new TapeDeck object was not created.

class TapeDeck {

    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapDeckTestDrive {

    public static void main(String[] args) {
        // Defined TapeDeck() object t.
        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {
            t.recordTape();
        }
    }
}

// B will not properly run, as the playDVD() method is not defined.

class DVDPlayer {

    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }
    // Added method playDVD() as it was missing.
    void playDVD() {
        System.out.println("DVD playing");
    }
}

class DVDPlayerTestDrive {

    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord) {
            d. recordDVD();
        }
    }
}
