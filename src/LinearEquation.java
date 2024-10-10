import java.text.DecimalFormat; // imports

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
    private String slopeFraction; // fraction form of slope
    private double yIntercept; // y-intercept
    private String slopeIntercept; // slope-intercept equation
    private double numerator; // numerator of slope as a fraction
    private double denominator; // denominator of slope as a fraction

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
        this.numerator = numerator;
        this.denominator = denominator;
        double slope = (double)(y2-y1)/(x2-x1); // decimal form (for calculations)
        String slopeFraction = numerator + "/" + denominator; // fraction form (for string)

        if (denominator < 0) { // moves negative to numerator or makes the fraction positive
            denominator = denominator * -1;
            numerator = numerator * -1;
            slopeFraction = numerator + "/" + denominator;
        }
        if (numerator % denominator == 0) { // simplifies the fractions into a whole number
            slopeFraction = Integer.toString(numerator/denominator);
        }

        this.slope = slope;
        this.slopeFraction = slopeFraction;
        return slope;
    }

    public double yIntercept() { // calculates y-intercept
        double yIntercept = (y1-(slope*x1));
        this.yIntercept = yIntercept;
        return yIntercept;
    }

    public String slopeIntercept() { // creates slope-intercept form of the equation
        if (slope == 1) { // removes 1 if slope is 1 (meaning it will be x)
            slopeFraction = "";
        }
        else if (slope == -1) { // removes -1 and adds - if slope is -1 (meaning it will be -x)
            slopeFraction = "-";
        }
        else if (slope == 0) { // slope is 0x
            slopeFraction = "0";
        }

        slopeIntercept = "y = " + slopeFraction + "x + " + formatter.format(yIntercept); // standard format of equation

        if (yIntercept == 0) { // given y-intercept is 0
            if (slope == 0 ){ // if slope also 0 then equation will be y = 0
                slopeIntercept = "y = " + slopeFraction;
            }
            else { // if slope isn't 0 there will be no y-intercept
                slopeIntercept = "y = " + slopeFraction + "x";
            }
        }
        if (yIntercept < 0) { // turns y-intercept positive but replaces + with -
            yIntercept = Math.abs(yIntercept);
            slopeIntercept = "y = " + slopeFraction + "x - " + formatter.format(yIntercept);
        }
        
        return slopeIntercept;
    }

    public double distance() { // calculates distance between the two coordinates
        double distance = Math.sqrt((Math.pow(numerator,2)) + (Math.pow(denominator,2)));
        return distance;
    }

    public void thirdPoint(double xValue) { // finds coordinate given an x-value and the current data of the two coordinates
        double yValue = slope * xValue + yIntercept;
        String thirdPoint = "(" + formatter.format(xValue) + "," + formatter.format(yValue) + ")";
        System.out.println("Solved coordinate point is: " + thirdPoint);
    }

    public String toString() { // formats data (coordinates, slope, y-intercept, slope-intercept equation, and distance) to be printed as a string
        String s = "First pair: " + coordinate1 + 
        "\nSecond pair: " + coordinate2 + 
        "\nSlope of line: " + formatter.format(slope()) + 
        "\nY-intercept: " + formatter.format(yIntercept()) + 
        "\nSlope intercept form: " + slopeIntercept() +
        "\nDistance between points: " + formatter.format(distance());
        return s;
    }
}
