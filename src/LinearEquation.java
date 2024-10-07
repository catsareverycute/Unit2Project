import java.text.DecimalFormat;

public class LinearEquation {
    DecimalFormat formatter = new DecimalFormat("0.00"); // rounding to hundredths
    // instance variables
    private String coordinate1; // first coordinate
    private String coordinate2; // second coordinate
    private int x1; // x value of first coordinate
    private int y1; // y value of first coordinate
    private int x2; // x value of second coordinate
    private int y2; // y value of second coordinate
    private double slope; // slope
    private String slopeFraction;
    private double yIntercept; // y-intercept
    private String slopeIntercept;

    // constructors
    public LinearEquation(String coordinate1, String coordinate2) { // isolates the values in the coordinates
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;

        int x1 = Integer.parseInt((coordinate1.substring(1,coordinate1.indexOf(","))));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",")+1,coordinate1.length()-1));
        int x2 = Integer.parseInt((coordinate2.substring(1,coordinate2.indexOf(","))));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",")+1,coordinate2.length()-1));
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope() { // calculates slope
        int numerator = y2-y1;
        int denominator = x2-x1;
        double slope = (double)(y2-y1)/(x2-x1);
        this.slope = slope;
        String slopeFraction = numerator + "/" + denominator;
        this.slopeFraction = slopeFraction;
        double floatResult = (double)numerator/denominator;
        int intResult = numerator/denominator;
        if (denominator == 1) {
            slopeFraction = Integer.toString(numerator);
        }
        if (floatResult == intResult) {
            slopeFraction = numerator/denominator + "";
        }
        return slope;
    }

    public double yIntercept() { // calculates y-intercept
        double yIntercept = (y1-(slope*x1));
        this.yIntercept = yIntercept;
        return yIntercept;
    }

    public String slopeIntercept() {
        if (slope == 1) {
            slopeFraction = "";
        }
        if (yIntercept == 0) {
            slopeIntercept = "y = " + slopeFraction + "x";
        }
        else {
            slopeIntercept = "y = " + slopeFraction + "x + " + formatter.format(yIntercept);
        }
        return slopeIntercept;
    }

    public String toString() {
        String s = "First pair: " + coordinate1 + "\nSecond pair: " + coordinate2 + "\nSlope of line: " + formatter.format(slope()) + "\nY-intercept: " + formatter.format(yIntercept()) + "\nSlope intercept form: " + slopeIntercept();
        return s;
    }
}