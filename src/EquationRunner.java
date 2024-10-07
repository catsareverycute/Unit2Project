public class EquationRunner {
    public static void main(String[] args) {
        String coordinate1 = "(0,0)";
        String coordinate2 = "(1,1)";

        int x1 = Integer.parseInt((coordinate1.substring(1,coordinate1.indexOf(","))));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",")+1,coordinate1.length()-1));
        int x2 = Integer.parseInt((coordinate2.substring(1,coordinate2.indexOf(","))));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",")+1,coordinate2.length()-1));
        System.out.println("(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
        LinearEquation LinearEquation = new LinearEquation(coordinate1,coordinate2);
        System.out.println(LinearEquation);
    }
}

