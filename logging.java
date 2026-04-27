package week9;
import org.apache.logging.log4j.*;
public class logging {
    private static final Logger log= LogManager.getLogger(logging.class);
    public void divide() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            log.error("ArithmeticException occurred.");
        }
    }
    public void array() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            log.error("ArrayIndexOutOfBoundsException occurred.");
        }
    }
    public void nul() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            log.error("NullPointerException occurred.");
        }
    }
    public static void main(String[] args) {
        logging obj = new logging();
        obj.divide();
        obj.array();
        obj.nul();
    }
}

