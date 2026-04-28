package week9;

import org.apache.logging.log4j.*;

public class Sys {

    private static final Logger log = LogManager.getLogger(Sys.class);

    public void divide() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            log.error("ArithmeticException occurred.");
            System.out.println("Application terminated with error code 1.");
            System.exit(1);
        }
    }

    public void array() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            log.error("ArrayIndexOutOfBoundsException occurred.");
            System.out.println("Application terminated with error code 1.");
            System.exit(1);
        }
    }

    public void nul() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            log.error("NullPointerException occurred.");
            System.out.println("Application terminated with error code 1.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Sys obj = new Sys();
        obj.divide();   // Test Case 1
        // obj.array(); // Test Case 2
        // obj.nul();   // Test Case 3
    }
}