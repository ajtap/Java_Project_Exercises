// Converts any inch measurement to meters.

public class project1_3 {

    public static void main(String[] args) {

        Parameter thing = new Parameter();
        int inches = 1000;

        thing.setMeters_result(inches);

        System.out.println(inches + " inches is " + thing.getMeters_result() + " meters.");

    }
}

class Parameter {

    private double meters_result;

    public double getMeters_result() {
        return meters_result;
    }
    public void setMeters_result(int inches) {
        meters_result = inches * 0.0254;
    }
}
