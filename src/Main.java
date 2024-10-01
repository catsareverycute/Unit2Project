//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String coordinate = "(1,313131313)";
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String x1 = (coordinate.substring(coordinate.indexOf(",") - 1));
        String test = (coordinate.substring(coordinate.indexOf(",") + 1));
        String y1 = test.substring(0,test.length()-1);
        System.out.println(y1);
        }
    }