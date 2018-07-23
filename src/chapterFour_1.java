// A runs successfully.
class XCopy {
    public static void main(String[] args) {

        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }
    private int go(int arg) {
        arg = arg * 2;

        return arg;
    }
}

// B won't work, as the getTime (accessor) returns no value (void).
//bladh blachadsf aasdfaf
class Clock {
    private String time;

    public void setTime(String t) {
        time = t;
    }
    // Changed return value from void to String.
    String getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main (String[] args) {

        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);

    }
}