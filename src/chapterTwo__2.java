//Simplified boolean conditional statement at the end of TestDrive() class.
//Not sure why boolean topHat is defined (no if statement to test for true), and why there is an extra d.playSnare() call.

class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}

class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.snare = false;

        d.playTopHat();
        if (d.snare) {
            d.playSnare();
        }
    }
}