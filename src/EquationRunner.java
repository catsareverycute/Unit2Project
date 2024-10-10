import java.util.Scanner; // imports

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first Coordinate Point: "); // 1st coordinate collecting
        String coordinate1 = s.nextLine();
        System.out.println("Enter your second Coordinate Point: "); // 2nd coordinate collecting
        String coordinate2 = s.nextLine();

        LinearEquation LinearEquation = new LinearEquation(coordinate1,coordinate2); // creates an object using the two coordinates
        System.out.println(LinearEquation); // prints out calculations of the coordinates

        System.out.println("Enter a third x-value: "); // x-value for 3rd coordinate collecting
        String xValue = s.nextLine();
        double x = Double.parseDouble(xValue); // converts to double to be able to use the thirdPoint
        LinearEquation.thirdPoint(x); // method to find the y-value that correlates with the x-value and then prints the coordinate

        s.close(); // yay
    }
}

