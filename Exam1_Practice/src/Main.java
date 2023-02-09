import java.awt.*;

public class Main {

    public static void main(String[] args) {
        testDigitsInARow(345696777);    // 3 digits in a row ("777")
        testDigitsInARow(0);            // 1 digit in a row
        testDigitsInARow(456);          // 1 digit in a row
        testDigitsInARow(9907);         // 2 digits in a row ("99")

        drawFootball();
    }

    private static void testDigitsInARow(int x) {
        System.out.println("\"" + x + "\" has " + digitsInARow(x) + " digits in a row");
    }

    private static int digitsInARow(int num) {
        // enter code here
        return -1;
    }

    private static void drawFootball() {
        // enter code here
    }
}