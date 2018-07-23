// Returns meters/second, kilometers/hr, and miles/hr based on meters, hours, minutes, and seconds.

public class project1_4 {

    public static void main(String[] args) {

        DRT miles = new DRT();
        DRT kilos = new DRT();
        DRT meters = new DRT();
        double meters_default = 2500;
        double hours = 5;
        double minutes = 56;
        double seconds = 23;

        meters.setDistance(meters_default);
        miles.setDistance(meters_default / 1609);
        kilos.setDistance(meters_default / 1000);

        meters.setMeterSpeed(hours, minutes, seconds);
        System.out.println("Your speed in meters/second is " + meters.getSpeed());

        kilos.setSpeed(hours, minutes, seconds);
        System.out.println("Your speed in km/h is " + kilos.getSpeed());

        miles.setSpeed(hours, minutes, seconds);
        System.out.println("Your speed in miles/h is " + miles.getSpeed());
    }
}

class DRT {

    private double distance;
    private double final_speed;

    public double getDistance() {
        return distance;
    }
    public void setDistance(double meters) {
        distance = meters;
    }

    public double getSpeed() {
        System.out.println(final_speed);
        return final_speed;
    }
    public void setSpeed(double h, double m, double s) {
        m = m + (s / 60);
        System.out.println(m);
        h = h + (m / 60);
        System.out.println(h);

        final_speed = getDistance() / h;
    }
    public void setMeterSpeed(double h, double m, double s) {
        m = m + (h * 60);
        s = s + (m * 60);

        final_speed = getDistance() / s;
    }
}
