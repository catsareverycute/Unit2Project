//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String coordinate1 = "(212,626)";
        String coordinate2 = "(123,456)";

        String test1 = (coordinate1.substring(coordinate1.indexOf(",") + 1));
        String test2 = (coordinate2.substring(coordinate2.indexOf(",") + 1));
        int x1 = Integer.parseInt((coordinate1.substring(1,coordinate1.indexOf(","))));
        int y1 = Integer.parseInt(test1.substring(0,test1.length()-1));
        int x2 = Integer.parseInt((coordinate2.substring(1,coordinate2.indexOf(","))));
        int y2 = Integer.parseInt(test2.substring(0,test2.length()-1));
        System.out.println("(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");

        }
    }
