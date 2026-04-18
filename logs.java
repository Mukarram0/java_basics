package week8;
import week8.logger;
import org.apache.logging.log4j.*;

public class logs {
   private static final Logger logg=logger.log(logs.class);
    public void divide() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            logg.error("ArithmeticException occurred.");
        }
    }
    public void array() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            logg.error("ArrayIndexOutOfBoundsException occurred.");
        }
    }

    public void nul() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            logg.error("NullPointerException occurred.");
        }
    }
    public static void main(String[] args) {
        logs obj = new logs();
        obj.divide();
        obj.array();
        obj.nul();
    }
}
